package com.ssm.controller.admin;

import com.alibaba.fastjson.JSONObject;
import com.ssm.domain.admin.AdminUser;
import com.ssm.service.admin.AdminUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 管理员登陆controller
 * Created by OvO on 2017/3/22.
 */
@Controller
@RequestMapping("/admin")
public class AdminLoginController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AdminUserService adminUserService;

    /*
    管理员登陆
     */
    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject login(@RequestBody AdminUser adminUser) {
        //要返回的json数据
        JSONObject json = new JSONObject();
        System.out.println(adminUser);
        if ("".equals(adminUser.getAdPassword())) {
            json.put("result", "error");
            return json;
        }
        if (adminUserService.getAdminUserByUsername(adminUser.getAdUsername()).equals(adminUser.getAdPassword())) {
            json.put("result", "success");
            return json;
        }
        json.put("result", "error");
        return json;
    }
}
