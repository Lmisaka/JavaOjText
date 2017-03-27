package com.ssm.controller.admin;

import com.ssm.domain.user.User;
import com.ssm.service.admin.AdminUserService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * 管理员登陆controller
 * Created by OvO on 2017/3/22.
 */
@Controller
@RequestMapping("/admin")
public class AdminLoginController {
    @Autowired
    private AdminUserService adminUserService;

    /*
    管理员登陆
     */
    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject login(@RequestBody User user, HttpServletResponse response) {
        //要返回的json数据
        JSONObject json = new JSONObject();
        if (adminUserService.getAdminUserByUsername(user.getUsername()).equals(user.getPassword())) {
            json.put("result","success");
            return json;
        }
        json.put("result","error");
        return json;
    }
}
