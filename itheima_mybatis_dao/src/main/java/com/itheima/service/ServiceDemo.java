package com.itheima.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.mapper.OrderMapper;
import com.itheima.mapper.UserMapper;
import com.itheima.domain.Order;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ServiceDemo {

//    public static void main(String[] args) throws IOException {
//        UserMapper userMapper = new UserMapperImpl();
//        List<User> userList = userMapper.findAll();
//        System.out.println(userList);
//    }

    @Test
    public void test1() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        PageHelper.startPage(2,3);
        List<User> userList = mapper.findAll();
        for (User user: userList){
            System.out.println(user);
        }

        PageInfo<User> userPageInfo = new PageInfo<>(userList);
        System.out.println(userPageInfo.getPageNum());
        System.out.println(userPageInfo.getPageSize());
        System.out.println(userPageInfo.getTotal());
        System.out.println(userPageInfo.getPages());
        System.out.println(userPageInfo.getSize());
        System.out.println(userPageInfo.getPrePage());
        System.out.println(userPageInfo.getNextPage());
        System.out.println(userPageInfo.isIsFirstPage());
        System.out.println(userPageInfo.isIsLastPage());

//        User user = mapper.findById(1);
//        System.out.println(user);
    }

    @Test
    public void test2() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> orderList = mapper.findAll();
        for (Order order: orderList){
            System.out.println(order);
        }


//        User user = mapper.findById(1);
//        System.out.println(user);
    }

    @Test
    public void test3() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.findAll();
        for (User user: userList){
            System.out.println(user);
        }


//        User user = mapper.findById(1);
//        System.out.println(user);
    }

    public static void main(String[] args) throws IOException {
//        User user = new User();
//        user.setId(1);
//        user.setUsername("tom3");
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> userList = mapper.findByCondition(user);
//        System.out.println(userList);
//        List<Integer> ids = new ArrayList<>();
//        ids.add(1);
//        List<User> users = mapper.findByIds(ids);
//        System.out.println(users);
//        User user = new User();
//        user.setUsername("tom4");
//        user.setPassword("tompassword");
//        user.setBirthday(new Date());
//        mapper.save(user);
//        sqlSession.commit();
//        sqlSession.close();

        User user2 = mapper.findById(7);
        System.out.println(user2.getBirthday());

    }
}
