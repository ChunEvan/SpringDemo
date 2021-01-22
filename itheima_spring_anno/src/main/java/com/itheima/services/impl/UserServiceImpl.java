package com.itheima.services.impl;

import com.itheima.mapper.UserDao;
import com.itheima.services.UserService;
import org.springframework.stereotype.Service;

//@Component("userService")
@Service("userService")
//@Scope("sigleton")
public class UserServiceImpl implements UserService {

//    @Value("${jdbc.driver}")
//    private String driver;

//    @Autowired
//    @Qualifier("userDao")
//    @Resource(name= "userDao")
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
//        System.out.println(driver);
        userDao.save();
    }

//    @PostConstruct
//    public void init(){
//        System.out.println("init ...");
//    }
//
//    @PreDestroy
//    public void destroy(){
//        System.out.println("destroy ..");
//    }
}
