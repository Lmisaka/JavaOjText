package com.ssm.controller.user;

import com.ssm.domain.user.User;
import com.ssm.domain.user.UserInfo;
import com.ssm.service.user.RegisterService;
import com.ssm.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by OvO on 2017/3/19.
 */
@Controller
@RequestMapping("/user")
public class LoginController {
    @Autowired
    private UserService userService;
    @Autowired
    private RegisterService registerService;

    private static Logger log = LoggerFactory.getLogger(LoginController.class);

    /*
    登陆
     */
    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Boolean> login(@RequestBody User user, HttpServletRequest request) {
        //要返回的json数据
        Map<String, Boolean> result = userService.getPasswdByName(user);
        if (userService.getPasswdByName(user).get("isSuccessful")) {
            getSession(request, user);
        }
        return result;
    }


    private void getSession(HttpServletRequest request, User user) {
        HttpSession session = request.getSession();
        session.setAttribute("isLoggedIn", true);
        session.setAttribute("username", user.getUsername());

    }

    @RequestMapping(value = "/exam")
    public String adminLogin() {
        return "exam";
    }


    @RequestMapping(value = "/register.do", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Boolean> Register(@RequestBody UserInfo userInfo) {
        System.out.println("+++++++++++++++++++++++++++++++++"+userInfo);
        Map<String, Boolean> result = new HashMap<>();
        result.put("isSuccessFul",false);
        result.put("isExist",false);
        switch (registerService.register(userInfo)) {
            case -1:
                result.put("isExist",true);
                break;
            case 1:
                result.put("isSuccessFul",true);
                break;
        }
        return result;
    }

}
