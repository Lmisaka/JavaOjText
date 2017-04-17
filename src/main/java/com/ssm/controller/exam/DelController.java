package com.ssm.controller.exam;

import com.ssm.service.exam.*;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by OvO on 2017/4/4.
 */
@Controller
@RequestMapping(value = "/delete")
public class DelController {
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
     * @param id
     * @return
     */
    @RequestMapping(value = "/blank",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject delBlank(@RequestBody Integer id) {
        JSONObject json = del(blankProblemService,id);
        return json;
    }

    /**
     * 增加选择题
     * 不区分单选和多选
     * 要采用ajax，返回操作信息：成功或失败
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/select",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject delSelect(@RequestBody Integer id) {
        JSONObject json = del(selectProblemService,id);
        return json;
    }

    /**
     * 添加编程题
     * @param id
     * @return
     */
    @RequestMapping(value = "/programme",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject delProgramme(@RequestBody Integer id) {
        JSONObject json = del(programmeService,id);
        return json;
    }

    /**
     *  添加非编程题
     * @param id
     * @return
     */
    @RequestMapping(value = "/unprogramme",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject delUnProgramme(@RequestBody Integer id) {
        JSONObject json = del(unProgrammeService,id);
        return json;
    }

    private JSONObject del(ProblemService problemService, Integer id){
        JSONObject json=new JSONObject();
        if (problemService.deleteByPrimaryKey(id) == 1) {
            json.put("result", "success");
            return json;
        } else
            json.put("result", "false");
        return json;
    }
}
