package com.ssm.dao.user;

import com.ssm.domain.user.UserInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoDao {
    int deleteByPrimaryKey(String username);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(String username);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}