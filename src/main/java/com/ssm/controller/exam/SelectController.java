package com.ssm.controller.exam;

import com.ssm.domain.exam.BlankProblem;
import com.ssm.domain.exam.ProgrammeWithBLOBs;
import com.ssm.domain.exam.SelectProblemWithBLOBs;
import com.ssm.domain.exam.Unprogramme;
import com.ssm.service.exam.BlankProblemService;
import com.ssm.service.exam.ProgrammeService;
import com.ssm.service.exam.SelectProblemService;
import com.ssm.service.exam.UnProgrammeService;
import com.ssm.service.exam.total.ProblemService;
import com.ssm.util.Pager;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

/**
 * Created by OvO on 2017/4/4.
 */
@Controller
@RequestMapping(value = "/select")
public class SelectController {
    @Autowired
    private BlankProblemService blankProblemService;
    @Autowired
    private SelectProblemService selectProblemService;
    @Autowired
    private ProgrammeService programmeService;
    @Autowired
    private UnProgrammeService unProgrammeService;

    /**
     * 返回页数
     * 接受数据范围：1-4
     * 1.返回选择题页数
     * 2.返回填空题页数
     * 3.返回编程题页数
     * 4.返回非编程题页数
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "pageCount/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Integer getPageCount(@PathVariable("id") Integer id) {
        int count = 0;
        switch (id) {
            case 1: {
                Pager<SelectProblemWithBLOBs> pager = new Pager<>();
                count = selectProblemService.getTotalCount();
                pager.setTotalCount(count);
                return pager.getTotalPage();
            }
            case 2: {
                Pager<BlankProblem> pager = new Pager<>();
                count = blankProblemService.getTotalCount();
                pager.setTotalCount(count);
                return pager.getTotalPage();
            }
            case 3: {
                Pager<ProgrammeWithBLOBs> pager = new Pager<>();
                count = programmeService.getTotalCount();
                pager.setTotalCount(count);
                return pager.getTotalPage();
            }
            case 4: {
                Pager<Unprogramme> pager = new Pager<>();
                count = unProgrammeService.getTotalCount();
                pager.setTotalCount(count);
                return pager.getTotalPage();
            }
            default:
                return 0;
        }
    }


    /**
     * 查询指定页的填空题数据
     *
     * @return
     */
    @RequestMapping(value = "/blank/{page}", method = RequestMethod.POST)
    @ResponseBody
    public JSONArray selectBlank(@PathVariable("page") Integer page) {
        Pager<BlankProblem> problemPager = new Pager<>();
        int count = blankProblemService.getTotalCount();
        problemPager.setTotalCount(count);
        HashMap<String, Object> paraMap = new HashMap<>();
        paraMap.put("start", (page - 1) * Pager.PAGE_SIZE);
        paraMap.put("limit", Pager.PAGE_SIZE);
        List<HashMap<String, String>> jsonResult = blankProblemService.getSubStrLimitList(paraMap);
        JSONArray json = JSONArray.fromObject(jsonResult);
        return json;
    }

    /**
     * 查询指定页的选择题
     * 不区分单选和多选
     * 返回查询结果
     *
     * @param page
     */
    @RequestMapping(value = "/select/{page}", method = RequestMethod.POST)
    @ResponseBody
    public JSONArray selectSelect(@PathVariable("page") Integer page) {
        Pager<SelectProblemWithBLOBs> problemPager = new Pager<>();
        int count = selectProblemService.getTotalCount();
        problemPager.setTotalCount(count);
        HashMap<String, Object> paraMap = new HashMap<>();
        paraMap.put("start", (page - 1) * Pager.PAGE_SIZE);
        paraMap.put("limit", Pager.PAGE_SIZE);
        List<HashMap<String, String>> jsonResult = selectProblemService.getSubStrLimitList(paraMap);
        JSONArray json = JSONArray.fromObject(jsonResult);
        System.out.println(json);
        return json;
    }

    /**
     * 添加编程题
     *
     * @param page
     * @return
     */
    @RequestMapping(value = "/programme/{page}", method = RequestMethod.POST)
    @ResponseBody
    public JSONArray selectProgramme(@PathVariable("page") Integer page) {
        Pager<ProgrammeWithBLOBs> problemPager = new Pager<>();
        int count = programmeService.getTotalCount();
        problemPager.setTotalCount(count);
        HashMap<String, Object> paraMap = new HashMap<>();
        paraMap.put("start", (page - 1) * Pager.PAGE_SIZE);
        paraMap.put("limit", Pager.PAGE_SIZE);
        List<HashMap<String, String>> jsonResult = programmeService.getSubStrLimitList(paraMap);
        JSONArray json = JSONArray.fromObject(jsonResult);

        return json;
    }

    /**
     * 查询非编程题
     *
     * @param page
     * @return
     */
    @RequestMapping(value = "/unprogramme/{page}", method = RequestMethod.POST)
    @ResponseBody
    public JSONArray selectUnProgramme(@PathVariable("page") Integer page) {
        Pager<Unprogramme> problemPager = new Pager<>();
        int count = unProgrammeService.getTotalCount();
        problemPager.setTotalCount(count);
        HashMap<String, Object> paraMap = new HashMap<>();
        paraMap.put("start", (page - 1) * Pager.PAGE_SIZE);
        paraMap.put("limit", Pager.PAGE_SIZE);
        List<HashMap<String, String>> jsonResult = unProgrammeService.getSubStrLimitList(paraMap);
        JSONArray json = JSONArray.fromObject(jsonResult);
        return json;
    }


    @RequestMapping("/getId/{ProblemId}/{id}")
    @ResponseBody
    public JSONArray selectById(@PathVariable("ProblemId") Integer ProblemId, @PathVariable("id") Integer id) {
        switch (ProblemId) {
            case 1: {
                JSONArray json = getEntityFromId(selectProblemService, id);
                return json;
            }
            case 2:
            {
                JSONArray json = getEntityFromId(blankProblemService, id);
                return json;
            }
            case 3:{
                JSONArray json = getEntityFromId(programmeService, id);
                return json;
            }
            case 4:{
                JSONArray json = getEntityFromId(unProgrammeService, id);
                return json;
            }
            default:
        }
        return null;
    }

    private JSONArray getEntityFromId(ProblemService problemService, Integer id) {
        JSONArray json = JSONArray.fromObject(problemService.selectById(id));
        return json;
    }
}
