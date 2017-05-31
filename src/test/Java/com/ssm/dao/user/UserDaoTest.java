package com.ssm.dao.user;


import com.ssm.domain.user.User;
import com.ssm.service.user.UserService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by OvO on 2017/5/9.
 */
public class UserDaoTest {
    @Autowired
    private static UserService userService;
    @Test
    public void selectByPrimaryKey() throws Exception {
        User user= new User();
        user.setUsername("misaka");
        user.setPassword("123456");
        userService.getPasswdByName(user);
    }
    @BeforeClass
    public static void init() {//junit之前init spring
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring/text.xml");//这里路径之前没有配对于是一直出错
        userService = (UserService) context.getBean("UserService");
    }
}