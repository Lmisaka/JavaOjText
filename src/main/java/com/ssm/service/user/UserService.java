package com.ssm.service.user;

import com.ssm.dao.user.UserDao;
import com.ssm.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by OvO on 2017/5/9.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public Map<String, Boolean> getPasswdByName(User user) {
        Map<String, Boolean> result = new HashMap<>();
        result.put("isUsernameEmpty", user.getUsername().isEmpty());
        result.put("isPasswordEmpty", user.getPassword().isEmpty());
        result.put("isSuccessful", false);
        if (!result.get("isUsernameEmpty") && !result.get("isPasswordEmpty")) {
            if (userDao.selectByPrimaryKey(user.getUsername()) != null && userDao.selectByPrimaryKey(user.getUsername()).equals(user.getPassword())) {
                result.put("isSuccessful", true);
            }
        }
        return result;
    }

}
