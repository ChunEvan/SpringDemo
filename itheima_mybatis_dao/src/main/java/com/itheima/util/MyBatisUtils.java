package com.itheima.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtils {
    private static SqlSession sqlSession;

    public static SqlSession openSession() {
        if (sqlSession==null){
            try {
                InputStream resourceAsStream  = Resources.getResourceAsStream("sqlMapConfig.xml");
                SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
                sqlSession = sqlSessionFactory.openSession();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sqlSession;
    }
}
