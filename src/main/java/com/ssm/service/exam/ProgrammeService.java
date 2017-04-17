package com.ssm.service.exam;

import com.ssm.dao.exam.ProgrammeDao;
import com.ssm.domain.exam.BlankProblem;
import com.ssm.domain.exam.ProblemEntity;
import com.ssm.domain.exam.ProgrammeWithBLOBs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by OvO on 2017/4/5.
 */
@Service
public class ProgrammeService implements ProblemService {
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private ProgrammeDao programmeDao;

    
    public int insert(ProblemEntity record) {
        return programmeDao.insert((ProgrammeWithBLOBs) record);
    }

    
    public ProblemEntity selectById(Integer id) {
        return programmeDao.selectByPrimaryKey(id);
    }

    /**
     * 通过关键字查询
     *
     * @param keyWord
     * @return
     */
    
    public ProblemEntity selectByKeyWorld(String keyWord) {
        return null;
    }

    
    public int updateByPrimaryKeySelective(ProblemEntity record) {
        return 0;
    }

    public ProblemEntity selectByKeyWord(String keyWord) {
        return programmeDao.selectByKeyWord(keyWord);
    }

    public int updateByPrimaryKey(ProblemEntity record) {
        return programmeDao.updateByPrimaryKeySelective((ProgrammeWithBLOBs)record);
    }

    
    public int deleteByPrimaryKey(Integer id) {
        return programmeDao.deleteByPrimaryKey(id);
    }

    
    public List<BlankProblem> selectAll() {
        return null;
    }

    /**
     * 获取信息条数
     *
     * @return
     */
    
    public int getTotalCount() {
        return  programmeDao.getTotalCount();
    }

    /**
     * 获取指定页数数据
     *
     * @param paraMap
     * @return
     */
    
    public List<ProblemEntity> getLimitList(HashMap<String, Object> paraMap) {
        return null;
    }
}
