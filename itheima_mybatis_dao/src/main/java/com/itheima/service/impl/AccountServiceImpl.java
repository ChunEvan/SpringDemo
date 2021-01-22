package com.itheima.service.impl;

import com.itheima.domain.Account;
import com.itheima.mapper.AccountMapper;
import com.itheima.service.AccountService;
import com.itheima.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper mapper;

    @Override
    public void save(Account account) {
        mapper.save(account);
    }

    @Override
    public List<Account> findAll() {
        return mapper.findAll();
    }

//    @Override
//    public void save(Account account) {
//        SqlSession sqlSession = MyBatisUtils.openSession();
//        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
//        System.out.println(mapper);
//        System.out.println(account);
//        mapper.save(account);
//        sqlSession.commit();
//        sqlSession.close();
//    }
//
//    @Override
//    public List<Account> findAll() {
//        SqlSession sqlSession = MyBatisUtils.openSession();
//        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
//        return mapper.findAll();
//    }
}
