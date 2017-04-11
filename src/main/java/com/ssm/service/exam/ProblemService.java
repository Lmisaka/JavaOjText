package com.ssm.service.exam;

import com.ssm.domain.exam.ProblemEntity;

/**统一的Service管理的接口
 * Created by OvO on 2017/4/11.
 */
public interface ProblemService {
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
