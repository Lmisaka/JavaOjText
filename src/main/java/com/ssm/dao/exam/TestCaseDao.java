package com.ssm.dao.exam;

import com.ssm.domain.exam.TestCase;
import org.springframework.stereotype.Repository;

@Repository("TextCaseDao")
public interface TestCaseDao {
    int insert(TestCase record);

    int insertSelective(TestCase record);

    String getById(Integer id);

    int deleteById(Integer id);


}