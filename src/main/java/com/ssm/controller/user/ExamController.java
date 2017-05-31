package com.ssm.controller.user;

import com.ssm.domain.exam.Answer;
import com.ssm.util.AutoCorrect;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 处理用户做题情况
 * Created by OvO on 2017/5/8.
 */
@Controller
@RequestMapping(value = "/exam")
public class ExamController {
    @RequestMapping(value = "/match",method = RequestMethod.POST)
    @ResponseBody
    public Integer examMatch(@RequestBody Answer answer) throws Exception {
        System.out.println(answer);
        AutoCorrect autoCorrect= new AutoCorrect();
        int count = autoCorrect.ExamCorrect(answer);
        return count;
    }

}
