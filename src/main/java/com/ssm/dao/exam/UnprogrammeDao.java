package com.ssm.dao.exam;

import com.ssm.domain.exam.Unprogramme;

public interface UnprogrammeDao {
    /**
     * 删除
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 增加非编程题
     *
     * @param record
     * @return
     */
    int insert(Unprogramme record);

    int insertSelective(Unprogramme record);

    /**
     * 查询
     * @param id
     * @return
     */
    Unprogramme selectByPrimaryKey(Integer id);

    /**
     * 关键字查询
     * @param keyWord
     * @return
     */
    Unprogramme selectByKeyWord(String keyWord);

    /**
     * 修改
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Unprogramme record);

    int updateByPrimaryKeyWithBLOBs(Unprogramme record);
}