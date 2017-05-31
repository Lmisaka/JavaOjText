package com.ssm.service.exam;

import com.ssm.dao.exam.TestCaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by OvO on 2017/5/22.
 */
@Service
public class TestCaseService {
    @Autowired
    private TestCaseDao testCaseDao;

    public String getById(Integer id){
        return testCaseDao.getById(id);
    }
}
