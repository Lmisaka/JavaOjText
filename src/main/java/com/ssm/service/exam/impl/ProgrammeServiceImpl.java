package com.ssm.service.exam.impl;

import com.ssm.dao.exam.ProgrammeDao;
import com.ssm.domain.exam.ProblemEntity;
import com.ssm.domain.exam.ProgrammeWithBLOBs;
import com.ssm.service.exam.ProblemService;
import com.ssm.service.exam.ProgrammeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by OvO on 2017/4/5.
 */
@Service
public class ProgrammeServiceImpl implements ProblemService,ProgrammeService {
    @SuppressWarnings("SpringJavaAutowiringInspection")
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
        return 0;
    }

    public ProblemEntity selectByKeyWord(String keyWord) {
        return programmeDao.selectByKeyWord(keyWord);
    }

    public int updateByPrimaryKey(ProblemEntity record) {
        return programmeDao.updateByPrimaryKeySelective((ProgrammeWithBLOBs)record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return programmeDao.deleteByPrimaryKey(id);
    }
}
