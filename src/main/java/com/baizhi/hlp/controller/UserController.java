package com.baizhi.hlp.controller;

import com.baizhi.hlp.entity.User;
import com.baizhi.hlp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;


    /**
     * 用户登录
     * */
    @RequestMapping("login")
    public String userLogin(String username,String password){
        User login = userService.login(username, password);

        if(login!=null){
            return "redirect:/ems/queryAll";
        }else{
            return "redirect:/login.jsp";
        }

    }

    /**
     *用户注册
     */
    @RequestMapping("insertUser")
    public String insertUser(User user, String code, HttpServletRequest request){
        String validationCode =(String) request.getSession().getAttribute("validationCode");

        if(code.equals(validationCode)){
            userService.insertUser(user);
            return "redirect:/login.jsp";
        }else{
            return "redirect:/regist.jsp";
        }



    }
}
