package com.rain.spring.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName UserFactoryBean
 * @Author Rain
 * @Date 2024/6/5 23:28
 * @Version 1.0
 */
public class UserFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
