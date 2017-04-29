package com.ssm.service.exam.total;

import com.ssm.domain.exam.ProblemEntity;

import java.util.HashMap;
import java.util.List;

/**
 * 所有service类实现的接口
 * 共同的数据库操作在这里声明
 * 用于统一地进行相同的操作
 * Created by OvO on 2017/4/17.
 */
public interface ProblemService {
    /**
     * 获取信息条数
     */
    int getTotalCount();

    /**
     * 插入一条新数据
     * @param record
     * @return
     */
    int insert(ProblemEntity record);

    /**
     * 获取指定id的数据
     * @param id
     * @return
     */
    ProblemEntity selectById(Integer id);

    /**
     * 模糊查询
     * @param keyWord
     * @return
     */
    ProblemEntity selectByKeyWorld(String keyWord);


    /**
     * 通过ID更新某一条数据
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(ProblemEntity record);

    /**
     * 通过ID删除对应数据
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);
    /**
     * 获取指定页面问题描述中的子串
     * @param paraMap
     * @return
     */
    List<HashMap<String,String>> getSubStrLimitList(HashMap<String,Object> paraMap);
}
