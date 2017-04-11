package com.ssm.service.exam;

import com.ssm.domain.exam.ProblemEntity;

/**
 * Created by OvO on 2017/4/5.
 */
public interface SelectProblemService {
//    int insert(SelectProblemWithBLOBs record);
//
//    SelectProblemWithBLOBs selectById(Integer id);
//
//    SelectProblemWithBLOBs selectByKeyWord(String keyWord);
//
//    int updateSelective(SelectProblemWithBLOBs record);
//
//    int deleteById(Integer id);
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
