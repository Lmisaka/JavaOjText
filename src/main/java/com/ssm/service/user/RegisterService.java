package com.ssm.service.user;

import com.ssm.dao.user.UserInfoDao;
import com.ssm.domain.user.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by OvO on 2017/5/10.
 */
@Service
public class RegisterService {
    @Autowired
    private UserInfoDao userInfoDao;

    public int register(UserInfo userInfo) {
        if (userInfoDao.selectByPrimaryKey(userInfo.getUsername()) != null) {
            return -1;
        }
        return userInfoDao.insert(userInfo);
    }
}
