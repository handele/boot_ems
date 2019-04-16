package com.baizhi.hlp.service;

import com.baizhi.hlp.entity.User;

public interface UserService {

    //登录
    public User login(String username, String password);

    //注册
    public void insertUser(User user);
}
