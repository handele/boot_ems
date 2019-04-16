package com.baizhi.hlp.service;

import com.baizhi.hlp.dao.UserDAO;
import com.baizhi.hlp.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Resource
    private UserDAO userDAO;

    @Override
    public User login(String username, String password) {
        return userDAO.login(username,password);
    }

    @Override
    public void insertUser(User user) {
        userDAO.insertUser(user);
    }
}
