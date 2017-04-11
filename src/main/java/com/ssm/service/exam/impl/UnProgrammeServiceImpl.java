package com.ssm.service.exam.impl;

import com.ssm.dao.exam.UnprogrammeDao;
import com.ssm.domain.exam.ProblemEntity;
import com.ssm.domain.exam.Unprogramme;
import com.ssm.service.exam.ProblemService;
import com.ssm.service.exam.UnProgrammeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by OvO on 2017/4/5.
 */
@Service
public class UnProgrammeServiceImpl implements ProblemService,UnProgrammeService {
    @SuppressWarnings("SpringJavaAutowiringInspection")
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
}
