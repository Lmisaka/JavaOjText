package com.ssm.dao.user;

import com.ssm.domain.user.UserInfo;
import org.springframework.stereotype.Repository;

@Repository(value = "UserInfoDao")
public interface UserInfoDao {
    int deleteByPrimaryKey(String username);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(String username);

    UserInfo selectByEmail(String Email);

    UserInfo selectByQQ(String QQ);

    UserInfo selectByTel(String tel);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}