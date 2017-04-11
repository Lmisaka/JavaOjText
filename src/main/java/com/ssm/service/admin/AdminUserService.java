package com.ssm.service.admin;

import com.ssm.domain.admin.AdminUser;

/**
 * Created by OvO on 2017/3/26.
 */
public interface AdminUserService {
    int deleteAdminUserByUsername(String ad_Username);

    int insert(AdminUser record);

    String getAdminUserByUsername(String ad_username);

    int updateAdminUser(AdminUser record);
}
