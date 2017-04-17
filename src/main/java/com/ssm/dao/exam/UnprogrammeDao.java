package com.ssm.dao.exam;

import com.ssm.domain.exam.Unprogramme;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
@Repository(value="UnprogrammeDao")
public interface UnprogrammeDao {
    /**
     * 删除
     *
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
     *
     * @param id
     * @return
     */
    Unprogramme selectByPrimaryKey(Integer id);

    /**
     * 关键字查询
     *
     * @param keyWord
     * @return
     */
    Unprogramme selectByKeyWord(String keyWord);

    /**
     * 修改
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Unprogramme record);

    int updateByPrimaryKeyWithBLOBs(Unprogramme record);

    /**
     * 获取信息条数
     *
     * @return
     */
    int getTotalCount();

    /**
     * 获取指定页数数据
     *
     * @param paraMap
     * @return
     */
    List<Unprogramme> getLimitList(HashMap<String, Object> paraMap);
}