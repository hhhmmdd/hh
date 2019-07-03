package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.entity.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Service
 *  1. 创建对象，加入ioc容器
 *  2. 加入ioc容器的对象的名称，默认是类名，首字母小写。
 *  3. 注意：要开启注解扫描
 */
@Service
public class AccountServiceImpl implements AccountService {

    // 注入dao
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }
}
