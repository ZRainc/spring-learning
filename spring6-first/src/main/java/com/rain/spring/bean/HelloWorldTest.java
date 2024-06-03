package com.rain.spring.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName HelloWorldTest
 * @Author Rain
 * @Date 2024/6/3 22:04
 * @Version 1.0
 */
public class HelloWorldTest {
    private static final Logger logger = LoggerFactory.getLogger(HelloWorldTest.class);
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
        helloWorld.sayHello();
        logger.info("执行成功");
    }
}
