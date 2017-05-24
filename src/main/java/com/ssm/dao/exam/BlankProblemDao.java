package com.ssm.dao.exam;

import com.ssm.domain.exam.BlankProblem;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
@Repository(value="BlankProblemDao")
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

    List<BlankProblem> selectAll();

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
    List<BlankProblem> getLimitList(HashMap<String,Object> paraMap);

    /**
     * 获取指定页面问题描述中的子串
     * @param paraMap
     * @return
     */
    List<HashMap<String,String>> getSubStrLimitList(HashMap<String,Object> paraMap);

    String getAnswerById(Integer id);
}