package com.ssm.dao.exam;

import com.ssm.domain.exam.SelectProblem;
import com.ssm.domain.exam.SelectProblemWithBLOBs;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
@Repository(value="SelectProblemDao")
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
    List<SelectProblemWithBLOBs> getLimitList(HashMap<String,Object> paraMap);
    /**
     * 获取指定页面问题描述中的子串
     * @param paraMap
     * @return
     */
    List<HashMap<String,String>> getSubStrLimitList(HashMap<String,Object> paraMap);
}