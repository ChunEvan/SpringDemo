package com.itheima.mapper.impl;

import com.itheima.mapper.UserDao;
import com.itheima.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoImpl implements UserDao {
    private String name;
    private int age;

    private List<String> strList;
    private Map<String, User> userMap;
    private Properties properties;

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserDaoImpl(){
        System.out.println("UserDaoImpl...");
    }

    public void init(){
        System.out.println("init...");
    }

    public void destroy(){
        System.out.println("destroy...");
    }

    public void save() {
        System.out.println("save running...");
        System.out.println("name: "+name+" age: "+age);
        System.out.println(strList);
        System.out.println(userMap);
        System.out.println(properties);
    }
}
