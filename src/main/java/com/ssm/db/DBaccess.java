package com.ssm.db;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**用于访问数据库
 * 该类用于将数据库操作与其他业务隔离开来
 * 便于进行事物管理
 * Created by 。。。 on 2017/3/7.
 */

public class DBaccess {
    /*
    获取数据库回话
    该方法异常一定要抛出
    使得获取数据库回话的方法能够关闭该回话
    */
    public SqlSession getSqlSession() throws IOException {
        //读取配置文件
        Reader reader= Resources.getResourceAsReader("config/Configuration.xml");
        //构建一个SqlSessionFactory用于创建数据库回话
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        //生成数据库回话
        SqlSession sqlSession=sqlSessionFactory.openSession();
        return sqlSession;
    }
}
