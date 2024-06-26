package com.rain.spring.bean;

import com.rain.spring.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName UserTest
 * @Author Rain
 * @Date 2024/6/3 23:28
 * @Version 1.0
 */
public class UserTest {
    @Test
    public void testBeanScope(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-scope.xml");
        User user1 = ac.getBean(User.class);
        User user2 = ac.getBean(User.class);
        System.out.println(user1==user2); //singleton -> true, prototype -> false
    }

    @Test
    public void testLife(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        User bean = ac.getBean(User.class);
        System.out.println("生命周期：4、通过IOC容器获取bean并使用");
        ac.close();
    }

    @Test
    public void testUserFactoryBean(){
        //获取IOC容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-factorybean.xml");
        User user = (User) ac.getBean("user");
        System.out.println(user);
    }

    @Test
    public void testAutoWireByXML(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("autowire-xml.xml");
        UserController userController = ac.getBean(UserController.class);
        userController.saveUser();
    }

}
