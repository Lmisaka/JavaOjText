package com.ssm.IDao;

import com.ssm.domain.user.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(String username);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(String username);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}