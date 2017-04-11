package com.ssm.service.admin.impl;

import com.ssm.dao.admin.AdminUserDao;
import com.ssm.domain.admin.AdminUser;
import com.ssm.service.admin.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by OvO on 2017/3/26.
 */
@Service
public class AdminUserServiceImpl implements AdminUserService {
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private AdminUserDao adminUserDao;

    public int deleteAdminUserByUsername(String ad_Username) {
        return adminUserDao.deleteByPrimaryKey(ad_Username);
    }

    public int insert(AdminUser record) {
        return adminUserDao.insertSelective(record);
    }

    public String getAdminUserByUsername(String ad_username) {
        return adminUserDao.selectByPrimaryKey(ad_username);
    }

    public int updateAdminUser(AdminUser record) {
        return adminUserDao.updateByPrimaryKey(record);
    }
}
