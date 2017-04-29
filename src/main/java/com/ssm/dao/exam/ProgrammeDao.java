package com.ssm.dao.exam;

import com.ssm.domain.exam.ProgrammeWithBLOBs;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
@Repository(value="ProgrammeDao")
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
    int updateByPrimaryKey(ProgrammeWithBLOBs record);
    /**
     * 获取信息条数
     * @return
     */
    int getTotalCount();

    /**
     * 获取指定页数数据
     * @param paraMap
     * @return
     */
    List<ProgrammeWithBLOBs> getLimitList(HashMap<String,Object> paraMap);
    /**
     * 获取指定页面问题描述中的子串
     * @param paraMap
     * @return
     */
    List<HashMap<String,String>> getSubStrLimitList(HashMap<String,Object> paraMap);
}