package com.itheima.controller;

import com.itheima.entity.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("account")
public class AccountController {

    // 注入service
    @Autowired
    private AccountService accountService;

    /**
     * 查询账户
     */
    @RequestMapping("findAll")
    public ModelAndView findAll(){
        //1. 调用service,查询账户
        List<Account> list = accountService.findAll();
        //2. 返回
        ModelAndView mv = new ModelAndView();
        mv.setViewName("list");
        mv.addObject("list",list);
        return mv;
    }
}








