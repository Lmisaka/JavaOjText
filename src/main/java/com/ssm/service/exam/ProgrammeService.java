package com.ssm.service.exam;

import com.ssm.dao.exam.ProgrammeDao;
import com.ssm.domain.exam.BlankProblem;
import com.ssm.domain.exam.ProblemEntity;
import com.ssm.domain.exam.ProgrammeWithBLOBs;
import com.ssm.service.exam.total.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by OvO on 2017/4/5.
 */
@Service
public class ProgrammeService implements ProblemService {
    @Autowired
    private ProgrammeDao programmeDao;

    @Override
    public int insert(ProblemEntity record) {
        return programmeDao.insert((ProgrammeWithBLOBs) record);
    }

    @Override
    public ProblemEntity selectById(Integer id) {
        return programmeDao.selectByPrimaryKey(id);
    }

    /**
     * 通过关键字查询
     *
     * @param keyWord
     * @return
     */
    @Override
    public ProblemEntity selectByKeyWorld(String keyWord) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(ProblemEntity record) {
        return programmeDao.updateByPrimaryKeySelective((ProgrammeWithBLOBs) record);
    }

    public ProblemEntity selectByKeyWord(String keyWord) {
        return programmeDao.selectByKeyWord(keyWord);
    }

    public int updateByPrimaryKey(ProblemEntity record) {
        return programmeDao.updateByPrimaryKeySelective((ProgrammeWithBLOBs) record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return programmeDao.deleteByPrimaryKey(id);
    }

    /**
     * 获取指定页面问题描述中的子串
     *
     * @param paraMap
     * @return
     */
    @Override
    public List<HashMap<String, String>> getSubStrLimitList(HashMap<String, Object> paraMap) {
        return programmeDao.getSubStrLimitList(paraMap);
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
        return programmeDao.getTotalCount();
    }

    /**
     * 获取指定页数数据
     *
     * @param paraMap
     * @return
     */

    public List<ProgrammeWithBLOBs> getLimitList(HashMap<String, Object> paraMap) {
        return programmeDao.getLimitList(paraMap);
    }

    public String getOutPutById(Integer id){
        return programmeDao.getOutPutById(id);
    }
}
