package com.itheima.factory;

import com.itheima.mapper.UserDao;
import com.itheima.mapper.impl.UserDaoImpl;

public class StaticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
