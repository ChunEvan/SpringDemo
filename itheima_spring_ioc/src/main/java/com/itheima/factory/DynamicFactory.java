package com.itheima.factory;

import com.itheima.mapper.UserDao;
import com.itheima.mapper.impl.UserDaoImpl;

public class DynamicFactory {

    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
