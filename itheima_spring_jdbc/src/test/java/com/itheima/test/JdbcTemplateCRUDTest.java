package com.itheima.test;


import com.itheima.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcTemplateCRUDTest {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void update(){
        jdbcTemplate.update("update account set money=? where name=?", 1000, "tom");

    }

    @Test
    public void delete(){
        jdbcTemplate.update("delete from account where name=?", "tom2");
    }

    @Test
    public void query(){
        List<Account> acountList = jdbcTemplate.query("select * from account", new BeanPropertyRowMapper<Account>(Account.class));
        System.out.println(acountList);
    }

    @Test
    public void queryOne(){
        Account account = jdbcTemplate.queryForObject("select * from account where name=?", new BeanPropertyRowMapper<>(Account.class), "tom");
        System.out.println(account);
    }

    @Test
    public void queryCount(){
        Integer count = jdbcTemplate.queryForObject("select count(*) from account", Integer.class);
        System.out.println(count);
    }

}
