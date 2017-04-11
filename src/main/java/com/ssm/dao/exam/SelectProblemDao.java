package com.ssm.dao.exam;

import com.ssm.domain.exam.SelectProblem;
import com.ssm.domain.exam.SelectProblemWithBLOBs;

public interface SelectProblemDao {
    /**
     * ID 删除
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 增加选择题
     * @param record
     * @return
     */
    int insert(SelectProblemWithBLOBs record);

    int insertSelective(SelectProblemWithBLOBs record);

    /**
     * 查询
     * @param id
     * @return
     */
    SelectProblemWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * 关键字查询
     * @param keyWord
     * @return
     */
    SelectProblemWithBLOBs selectByKeyWord(String keyWord);

    /**
     * 更新
     * 选择selective，是因为有些值为空
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(SelectProblemWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SelectProblemWithBLOBs record);

    int updateByPrimaryKey(SelectProblem record);
}