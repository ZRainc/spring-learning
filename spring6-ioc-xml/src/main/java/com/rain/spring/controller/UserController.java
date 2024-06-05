package com.rain.spring.controller;

import com.rain.spring.service.UserService;

/**
 * @ClassName UserController
 * @Author Rain
 * @Date 2024/6/5 23:31
 * @Version 1.0
 */
public class UserController {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser(){
        userService.saveUser();
    }
}
