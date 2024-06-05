package com.rain.spring.dao.Impl;

import com.rain.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @ClassName UserDao
 * @Author Rain
 * @Date 2024/6/5 23:57
 * @Version 1.0
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void print() {
        System.out.println("Dao层执行结束");
    }
}
