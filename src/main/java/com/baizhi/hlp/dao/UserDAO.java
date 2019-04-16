package com.baizhi.hlp.dao;

import com.baizhi.hlp.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDAO {

    //登录
    public User login(@Param("username") String username, @Param("password") String password);

    //添加用户
    public void insertUser(User user);

}
