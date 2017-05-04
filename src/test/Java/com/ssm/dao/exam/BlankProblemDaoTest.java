package com.ssm.dao.exam;

import com.ssm.domain.exam.BlankProblem;
import com.ssm.service.exam.BlankProblemService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;

/**
 * Created by OvO on 2017/4/15.
 */
public class BlankProblemDaoTest {
    @Test
    public void getSubStrLimitList() throws Exception {
        HashMap<String,Object> paraMap=new HashMap<>();
        paraMap.put("start",5);
        paraMap.put("limit",6);
        List<HashMap<String,String>> result=blankProblemService.getSubStrLimitList(paraMap);
        for (HashMap<String,String> res:result){
            System.out.println(res);
        }
    }

    @Test
    public void getLimitList() throws Exception {
        HashMap<String,Object> paraMap=new HashMap<>();
        paraMap.put("start",5);
        paraMap.put("limit",6);
        List<BlankProblem> blankProblemList = blankProblemService.getLimitList(paraMap);
        for(BlankProblem problem:blankProblemList){
            System.out.println(problem);
        }
//        List<BlankProblem> blankProblemList= blankProblemService.getLimitList();
    }

    @Test
    public void getTotalCount() throws Exception {
        System.out.println(blankProblemService.getTotalCount());
    }

    @Autowired
    public static BlankProblemService blankProblemService;

    @Test
    public void selectAll() throws Exception {
//      BlankProblem problem= (BlankProblem)blankProblemService.selectById(1);
//        System.out.println(problem);
    }

    @BeforeClass
    public static void init() {//junit之前init spring
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring/text.xml");//这里路径之前没有配对于是一直出错
        blankProblemService = (BlankProblemService) context.getBean("blankProblemService");
    }
}