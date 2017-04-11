package com.ssm.controller.exam;

import com.ssm.domain.exam.*;
import com.ssm.service.exam.*;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 增加
 * Created by OvO on 2017/4/4.
 */
@Controller
@RequestMapping(value = "/add")
public class AddController {

    @Autowired
    private BlankProblemService blankProblemService;
    @Autowired
    private SelectProblemService selectProblemService;
    @Autowired
    private ProgrammeService programmeService;
    @Autowired
    private UnProgrammeService unProgrammeService;
    /**
     * 添加填空题
     * @param blankProblem
     * @return
     */
    @RequestMapping(value = "/blank",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject addBlank(@RequestBody BlankProblem blankProblem) {
        System.out.println(blankProblem + "++++++++++++++++");
        JSONObject json = add((ProblemService) blankProblemService,blankProblem);
        return json;
    }

    /**
     * 增加选择题
     * 不区分单选和多选
     * 要采用ajax，返回操作信息：成功或失败
     *
     * @param selectProblem
     */
    @RequestMapping(value = "/select",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject addSelect(@RequestBody SelectProblemWithBLOBs selectProblem) {
        System.out.println(selectProblem + "++++" + selectProblem.getCorrect());
        JSONObject json = add((ProblemService) selectProblemService,selectProblem);
        return json;
    }

    /**
     * 添加编程题
     * @param programme
     * @return
     */
    @RequestMapping(value = "/programme",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject addProgramme(@RequestBody ProgrammeWithBLOBs programme) {
        System.out.println(programme + "++++++++++++++++");
        JSONObject json = add((ProblemService) programmeService,programme);
        return json;
    }

    /**
     *  添加非编程题
     * @param unprogramme
     * @return
     */
    @RequestMapping(value = "/unprogramme",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject addUnProgramme(@RequestBody Unprogramme unprogramme) {
        System.out.println(unprogramme + "++++++++++++++++");
        JSONObject json = add((ProblemService) unProgrammeService,unprogramme);
        return json;
    }

    private JSONObject add(ProblemService problemService, ProblemEntity problemEntity){
        JSONObject json=new JSONObject();
        if (problemService.insert(problemEntity) == 1) {
            json.put("result", "success");
            return json;
        } else
            json.put("result", "false");
        return json;
    }
}
