package com.ssm.controller.admin;

import com.ssm.domain.admin.AdminUser;
import com.ssm.service.admin.AdminUserService;
import net.sf.json.JSONObject;
import org.apache.commons.collections.map.HashedMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * 管理员登陆controller
 * Created by OvO on 2017/3/22.
 */
@Controller
@RequestMapping("/admin")
public class AdminLoginController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/adminLogin")
    public String adminLogin() {
        return "adminLogin";
    }

    @Autowired
    private AdminUserService adminUserService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index( ) {
        ModelAndView mav = new ModelAndView("adminIndex");
        return mav;
    }

    /*
    管理员登陆
    TODO:未完成
     */
    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Boolean> login(@RequestBody AdminUser adminUser, Model model) {
        //要返回的json数据
        Map<String, Boolean> result = new HashedMap();
        //验证账号是否存在
        result.put("isSuccess", false);
        if ("".equals(adminUserService.getAdminUserByUsername(adminUser.getAdUsername())) || adminUserService.getAdminUserByUsername(adminUser.getAdUsername()) == null) {
            return result;
        }
        //密码匹配
        if (adminUserService.getAdminUserByUsername(adminUser.getAdUsername()).equals(adminUser.getAdPassword())) {
            result.put("isSuccess", true);
            return result;
        }
        return result;
    }

    @RequestMapping(value = "/textLogin.do", method = RequestMethod.POST)
    public ModelAndView textLogin(@RequestParam("adUsername") String adUsername, @RequestParam("adPassword") String adPassword) {
        AdminUser adminUser = new AdminUser(adUsername, adPassword);
        //要返回的json数据
        JSONObject json = new JSONObject();
        ModelAndView mav = new ModelAndView();
        Map<String, Object> result = new HashedMap();
        System.out.println(adminUser);
        if ("".equals(adminUser.getAdPassword())) {
            json.put("result", "error");
            mav.setViewName("adminLogin");
//            result.put("result", "error");
            return mav;
        }
        if (adminUserService.getAdminUserByUsername(adminUser.getAdUsername()).equals(adminUser.getAdPassword())) {
            json.put("result", "success");
            mav.setViewName("adminIndex");
            mav.addObject("username", adminUser.getAdUsername());
//            model.addAttribute("username", adminUser.getAdUsername());
            result.put("result", "success");
            return mav;
        }
        mav.setViewName("adminLogin");
        result.put("result", "error");
        return mav;
    }
}
