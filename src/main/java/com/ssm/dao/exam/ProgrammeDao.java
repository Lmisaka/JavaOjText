package com.ssm.dao.exam;

import com.ssm.domain.exam.Programme;
import com.ssm.domain.exam.ProgrammeWithBLOBs;

public interface ProgrammeDao {
    /**
     * 通过ID进行删除
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);
    /**
     * 增加编程题
     * @param record
     * @return
     */
    int insert(ProgrammeWithBLOBs record);

    int insertSelective(ProgrammeWithBLOBs record);
    /**
     * 通过ID查询
     * @param id
     * @return
     */
    ProgrammeWithBLOBs selectByPrimaryKey(Integer id);
    /**
     * 通过关键字进行查询
     * @param keyWord
     * @return
     */
    ProgrammeWithBLOBs selectByKeyWord(String keyWord);
    int updateByPrimaryKeySelective(ProgrammeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ProgrammeWithBLOBs record);
    /**
     * 修改操作
     * @param record
     * @return
     */
    int updateByPrimaryKey(Programme record);
}