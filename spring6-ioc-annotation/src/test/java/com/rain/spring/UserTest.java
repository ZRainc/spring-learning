package com.rain.spring;

import com.rain.spring.controller.UserController;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName UserTest
 * @Author Rain
 * @Date 2024/6/6 00:02
 * @Version 1.0
 */
public class UserTest {
    private Logger logger = LoggerFactory.getLogger(UserTest.class);

    @Test
    public void testAnnotation(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserController userController = context.getBean("userController", UserController.class);
        userController.out();
        logger.info("执行成功");
    }
}
