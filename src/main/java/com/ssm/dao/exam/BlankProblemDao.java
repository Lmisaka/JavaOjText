package com.ssm.dao.exam;

import com.ssm.domain.exam.BlankProblem;

public interface BlankProblemDao {
    /**
     * 通过ID删除
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 增加填空题
     * @param record
     * @return
     */
    int insert(BlankProblem record);

    int insertSelective(BlankProblem record);

    /**
     * 通过ID进行查询
     * @param id
     * @return
     */
    BlankProblem selectByPrimaryKey(Integer id);

    /**
     * 通过ID进行修改
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(BlankProblem record);

    int updateByPrimaryKeyWithBLOBs(BlankProblem record);

    /**
     * 通过关键字进行查询
     * @param keyWord
     * @return
     */
    BlankProblem selectByKeyWorld(String keyWord);
}