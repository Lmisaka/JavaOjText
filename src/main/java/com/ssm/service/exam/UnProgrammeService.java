package com.ssm.service.exam;

import com.ssm.dao.exam.UnprogrammeDao;
import com.ssm.domain.exam.BlankProblem;
import com.ssm.domain.exam.ProblemEntity;
import com.ssm.domain.exam.Unprogramme;
import com.ssm.service.exam.total.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by OvO on 2017/4/5.
 */
@Service
public class UnProgrammeService implements ProblemService {
    @Autowired
    private UnprogrammeDao unprogrammeDao;

    @Override
    public int insert(ProblemEntity record) {
        return unprogrammeDao.insert((Unprogramme) record);
    }

    @Override
    public ProblemEntity selectById(Integer id) {
        return unprogrammeDao.selectByPrimaryKey(id);
    }

    /**
     * 通过关键字查询
     *
     * @param keyWord
     * @return
     */
    @Override
    public ProblemEntity selectByKeyWorld(String keyWord) {
        return unprogrammeDao.selectByKeyWord(keyWord);
    }

    @Override
    public int updateByPrimaryKeySelective(ProblemEntity record) {
        return unprogrammeDao.updateByPrimaryKeySelective((Unprogramme) record);
    }

    /**
     * 通过ID进行删除
     *
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return unprogrammeDao.deleteByPrimaryKey(id);
    }

    /**
     * 获取指定页面问题描述中的子串
     *
     * @param paraMap
     * @return
     */
    @Override
    public List<HashMap<String, String>> getSubStrLimitList(HashMap<String, Object> paraMap) {
        return unprogrammeDao.getSubStrLimitList(paraMap);
    }


    public List<BlankProblem> selectAll() {
        return null;
    }

    /**
     * 获取信息条数
     *
     * @return
     */
    @Override
    public int getTotalCount() {
        return unprogrammeDao.getTotalCount();
    }

    /**
     * 获取指定页数数据
     *
     * @param paraMap
     * @return
     */

    public List<Unprogramme> getLimitList(HashMap<String, Object> paraMap) {
        return unprogrammeDao.getLimitList(paraMap);
    }

    public String getAnswerById(Integer id){
        return unprogrammeDao.getAnswerById(id);
    }
}
