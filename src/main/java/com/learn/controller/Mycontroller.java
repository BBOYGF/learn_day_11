package com.learn.controller;

import com.learn.service.GetDate;
import com.learn.service.impl.mGetdata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/text")
public class Mycontroller {
    @Autowired
    private mGetdata getdate;
    @RequestMapping("/demo")
    public String test()
    {
        System.out.println("执行业务层...");
        getdate.getDate();
        return "test";
    }
}
