package com.ssm.controller.exam;

import com.ssm.service.exam.BlankProblemService;
import com.ssm.service.exam.ProgrammeService;
import com.ssm.service.exam.SelectProblemService;
import com.ssm.service.exam.UnProgrammeService;
import com.ssm.service.exam.total.ProblemService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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


    @RequestMapping(value = "/{ProblemId}/{id}")
    @ResponseBody
    public JSONObject deleteById(@PathVariable("ProblemId") Integer ProblemId, @PathVariable("id") Integer id) {
        switch (ProblemId) {
            case 1: {
                JSONObject json = deleteProblemById(selectProblemService, id);
                return json;
            }
            case 2: {
                JSONObject json = deleteProblemById(blankProblemService, id);
                return json;
            }
            case 3: {
                JSONObject json = deleteProblemById(programmeService, id);
                return json;
            }
            case 4: {
                JSONObject json = deleteProblemById(unProgrammeService, id);
                return json;
            }
        }
        return null;
    }

    private JSONObject deleteProblemById(ProblemService problemService, Integer id) {
        JSONObject json =new JSONObject();
        if (problemService.deleteByPrimaryKey(id) == 1) {
            json.put("result", "success");
            return json;
        } else
            json.put("result", "false");
        return json;
    }
}
