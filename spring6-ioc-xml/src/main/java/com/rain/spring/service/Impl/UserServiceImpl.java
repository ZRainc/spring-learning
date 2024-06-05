package com.rain.spring.service.Impl;

import com.rain.spring.dao.UserDao;
import com.rain.spring.service.UserService;

/**
 * @ClassName UserServiceImpl
 * @Author Rain
 * @Date 2024/6/5 23:32
 * @Version 1.0
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
