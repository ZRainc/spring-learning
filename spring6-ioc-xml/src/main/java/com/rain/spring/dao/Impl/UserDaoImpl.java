package com.rain.spring.dao.Impl;

import com.rain.spring.dao.UserDao;

/**
 * @ClassName UserDaoImpl
 * @Author Rain
 * @Date 2024/6/5 23:33
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
