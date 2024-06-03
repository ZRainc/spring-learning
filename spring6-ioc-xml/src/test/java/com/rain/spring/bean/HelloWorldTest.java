package com.rain.spring.bean;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @ClassName HelloWorldTest
 * @Author Rain
 * @Date 2024/6/3 22:19
 * @Version 1.0
 */
public class HelloWorldTest {
    private Logger logger = LoggerFactory.getLogger(HelloWorldTest.class);

    @Test
    public void testHelloWorld(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
        helloWorld.sayHello();
    }

    @Test
    public void testHelloWorld1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld bean = ac.getBean(HelloWorld.class);
        bean.sayHello();
    }

    @Test
    public void testHelloWorld2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld bean = ac.getBean("helloWorld", HelloWorld.class);
        bean.sayHello();
    }

    @Test
    public void testDIBySet() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-di.xml");
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);
    }

    @Test
    public void testDIByConstructor() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-di.xml");
        Student student = applicationContext.getBean("studentTwo", Student.class);
        System.out.println(student);
    }

    @Test
    public void testDataSource() throws SQLException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-datasource.xml");
        DataSource dataSource = ac.getBean(DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
}
