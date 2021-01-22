package com.itheima.service.impl;

import com.itheima.mapper.AccountDao;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
//@Transactional
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

//    public void setAccountDao(AccountDao accountDao){
//        this.accountDao= accountDao;
//    }

//    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    @Transactional
    public void transfer(String outMan, String inMan, double money) {
        accountDao.out(outMan, money);
        System.out.println("out "+ outMan+" "+money);
        int i= 1/0;
        accountDao.in(inMan, money);
        System.out.println("in "+ outMan+" "+money);
    }
}
