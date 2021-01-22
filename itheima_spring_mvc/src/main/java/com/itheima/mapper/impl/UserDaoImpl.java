package com.itheima.mapper.impl;

import com.itheima.mapper.UserDao;

//@Component("userDao")
//@Controller("userDao")
//@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("userDao save...");
    }
}
