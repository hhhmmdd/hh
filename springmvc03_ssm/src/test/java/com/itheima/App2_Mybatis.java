package com.itheima;

import com.itheima.dao.AccountDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class App2_Mybatis {
    @Test
    public void findAll() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        // 最关键的对象：SqlSessionFactory
        SqlSessionFactory factory = builder.build(in);
        SqlSession sqlSession = factory.openSession();
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        // 最重要的代码：调用方法
        System.out.println(accountDao.findAll());

        sqlSession.commit();
        sqlSession.close();
        in.close();
    }
}
