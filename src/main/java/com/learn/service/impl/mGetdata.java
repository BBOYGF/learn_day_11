package com.learn.service.impl;

import com.learn.service.GetDate;
import org.springframework.stereotype.Component;

@Component
public class mGetdata implements GetDate {
    @Override
    public void getDate() {
        System.out.println("service执行了。。。");
    }
}
