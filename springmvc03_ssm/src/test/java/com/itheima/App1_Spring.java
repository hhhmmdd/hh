package com.itheima;

import com.itheima.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class App1_Spring {

    // 注入service
    @Autowired
    private AccountService accountService;

    @Test
    public void findAll(){
        System.out.println(accountService.findAll());
    }
}
