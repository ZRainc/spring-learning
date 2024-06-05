package com.rain.spring.controller;

import com.rain.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @ClassName UserController
 * @Author Rain
 * @Date 2024/6/6 00:01
 * @Version 1.0
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public void out() {
        userService.out();
        System.out.println("Controller层执行结束。");
    }
}
