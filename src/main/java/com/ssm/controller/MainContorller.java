package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 实现页面访问
 * Created by OvO on 2017/3/24.
 */
@Controller
public class MainContorller {
    @RequestMapping(value = "/")
    public String index() {
        return "login";
    }

    @RequestMapping(value = "/time")
    public String time() {
        return "time";
    }

    @RequestMapping(value = "/text")
    public String text() {
        return "exam";
    }
}
