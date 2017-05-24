package com.ssm.dao.user;

import com.ssm.domain.user.User;
import org.springframework.stereotype.Repository;

@Repository(value = "UserDao")
public interface UserDao {
    int deleteByPrimaryKey(String username);

    int insert(User record);

    int insertSelective(User record);

    String selectByPrimaryKey(String username);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}