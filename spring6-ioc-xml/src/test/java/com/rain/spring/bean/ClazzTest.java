package com.rain.spring.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName ClazzTest
 * @Author Rain
 * @Date 2024/6/3 23:04
 * @Version 1.0
 */
public class ClazzTest {
    @Test
    public void testHelloWorld(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-di.xml");
        Clazz clazz = (Clazz) applicationContext.getBean("clazzThree");
        System.out.println(clazz);
    }
}
