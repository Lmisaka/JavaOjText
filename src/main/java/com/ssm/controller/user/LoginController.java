package com.ssm.controller.user;

import com.alibaba.fastjson.JSONObject;
import com.ssm.domain.user.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 *
 * Created by OvO on 2017/3/19.
 */
@Controller
@RequestMapping("/user")
public class LoginController {

    private static Logger log= LoggerFactory.getLogger(LoginController.class);
    /*
    登陆
    TODO:要修改；先完成管理员的先
     */
    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject login(@RequestBody User user, HttpServletResponse response) {
        System.out.println(user);
        //要返回的json数据
        JSONObject json = new JSONObject();
        if (user.getPassword().equals("123")) {
            json.put("result", "success");
            System.out.println(json);
            return json;
        }
        json.put("result", "false");
        return json;
    }
//    /*
//    注册
//     TODO:未完成
//     */
//    @RequestMapping(value = "/register.do",method = RequestMethod.POST)
//    @ResponseBody
//    public JSONObject Register(@RequestBody )
}
