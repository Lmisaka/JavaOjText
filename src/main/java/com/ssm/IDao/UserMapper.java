package com.ssm.IDao;

import com.ssm.domain.user.User;

public interface UserMapper {
    int deleteByPrimaryKey(String username);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String username);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}