package com.rain.spring.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName ClazzTest
 * @Author Rain
 * @Date 2024/6/3 22:49
 * @Version 1.0
 */
public class StudentTest {

    @Test
    public void testDI1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-di.xml");
        Student student = applicationContext.getBean("studentFour", Student.class);
        System.out.println(student);
    }

    @Test
    public void testDI2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-di.xml");
        Student student = applicationContext.getBean("studentFive", Student.class);
        System.out.println(student);
    }

    @Test
    public void testDI3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-di.xml");
        Student student = applicationContext.getBean("studentSix", Student.class);
        System.out.println(student);
    }

    @Test
    public void testDI4() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-di.xml");
        Student student = applicationContext.getBean("studentSeven", Student.class);
        System.out.println(student);
    }

    @Test
    public void testDI5() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-di.xml");
        Student student = applicationContext.getBean("studentEight", Student.class);
        System.out.println(student);
    }
}
