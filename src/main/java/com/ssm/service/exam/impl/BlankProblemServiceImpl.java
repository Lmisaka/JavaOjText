package com.ssm.service.exam.impl;

import com.ssm.dao.exam.BlankProblemDao;
import com.ssm.domain.exam.BlankProblem;
import com.ssm.domain.exam.ProblemEntity;
import com.ssm.service.exam.BlankProblemService;
import com.ssm.service.exam.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by OvO on 2017/4/5.
 */
@Service
public class BlankProblemServiceImpl implements ProblemService,BlankProblemService {
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private BlankProblemDao blankProblemDao;

    @Override
    public int insert(ProblemEntity record) {
        return blankProblemDao.insert((BlankProblem) record);
    }

    @Override
    public ProblemEntity selectById(Integer id) {
        return blankProblemDao.selectByPrimaryKey(id);
    }

    @Override
    public ProblemEntity selectByKeyWorld(String keyWord) {
        return blankProblemDao.selectByKeyWorld(keyWord);
    }

    @Override
    public int updateByPrimaryKeySelective(ProblemEntity record) {
        return blankProblemDao.updateByPrimaryKeySelective((BlankProblem)record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return blankProblemDao.deleteByPrimaryKey(id);
    }
}
