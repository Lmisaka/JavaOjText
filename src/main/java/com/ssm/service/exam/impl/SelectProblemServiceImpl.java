package com.ssm.service.exam.impl;

import com.ssm.dao.exam.SelectProblemDao;
import com.ssm.domain.exam.ProblemEntity;
import com.ssm.domain.exam.SelectProblemWithBLOBs;
import com.ssm.service.exam.ProblemService;
import com.ssm.service.exam.SelectProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by OvO on 2017/4/5.
 */
@Service
public class SelectProblemServiceImpl implements ProblemService,SelectProblemService {
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private SelectProblemDao selectProblemDao;

    @Override
    public int insert(ProblemEntity record) {
        return selectProblemDao.insert((SelectProblemWithBLOBs) record);
    }

    @Override
    public ProblemEntity selectById(Integer id) {
        return selectProblemDao.selectByPrimaryKey(id);
    }

    /**
     * 通过关键字查询
     *
     * @param keyWord
     * @return
     */
    @Override
    public ProblemEntity selectByKeyWorld(String keyWord) {
        return selectProblemDao.selectByKeyWord(keyWord);
    }

    @Override
    public int updateByPrimaryKeySelective(ProblemEntity record) {
        return selectProblemDao.updateByPrimaryKeySelective((SelectProblemWithBLOBs) record);
    }

    /**
     * 通过ID进行删除
     *
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return selectProblemDao.deleteByPrimaryKey(id);
    }

}
