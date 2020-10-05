package com.learn.dao.impl;

import com.learn.dao.User;

public class mUser implements User {
    @Override
    public void getdate() {
        System.out.println("dao层获取数据。。。");
    }
}
