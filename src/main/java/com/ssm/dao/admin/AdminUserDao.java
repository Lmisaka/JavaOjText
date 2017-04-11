package com.ssm.dao.admin;

import com.ssm.domain.admin.AdminUser;
import org.apache.ibatis.annotations.Param;

/**
 * Created by OvO on 2017/3/25.
 */
public interface AdminUserDao {
    int deleteByPrimaryKey(String ad_Username);

    int insert(AdminUser record);

    int insertSelective(AdminUser record);

    String selectByPrimaryKey(@Param("adUsername") String ad_Username);

    int updateByPrimaryKeySelective(AdminUser record);

    int updateByPrimaryKey(AdminUser record);
}
