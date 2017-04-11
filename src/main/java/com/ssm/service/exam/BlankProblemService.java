package com.ssm.service.exam;

import com.ssm.domain.exam.ProblemEntity;

/**
 * Created by OvO on 2017/4/5.
 */
public interface BlankProblemService  {
//    /**
//     * 插入新的填空题
//     *
//     * @param record
//     * @return
//     */
//    int insert(BlankProblem record);
//
//    /**
//     * 通过自增ID查询
//     *
//     * @param id
//     * @return
//     */
//    BlankProblem selectById(Integer id);
//
//    /**
//     * 通过关键字查询
//     *
//     * @param keyWord
//     * @return
//     */
//    BlankProblem selectByKeyWorld(String keyWord);
//
//    int updateByPrimaryKeySelective(BlankProblem record);
//
//
//    /**
//     * 通过ID进行删除
//     * @param id
//     * @return
//     */
//    int deleteByPrimaryKey(Integer id);
//
    /**
     * 插入新的题
     *
     * @param record
     * @return
     */
    int insert(ProblemEntity record);

    /**
     * 通过自增ID查询
     *
     * @param id
     * @return
     */
    ProblemEntity selectById(Integer id);

    /**
     * 通过关键字查询
     *
     * @param keyWord
     * @return
     */
    ProblemEntity selectByKeyWorld(String keyWord);

    int updateByPrimaryKeySelective(ProblemEntity record);


    /**
     * 通过ID进行删除
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);
}
