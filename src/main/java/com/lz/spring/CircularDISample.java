package com.lz.spring;

import com.lz.spring.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircularDISample {
    private static final Logger logger = LoggerFactory.getLogger(CircularDISample.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/beans.xml");
        logger.info("ApplicationContext has bean initialized.");
        User user = context.getBean("user001", User.class);
        System.out.println(user);
        logger.info("ApplicationContext has bean closed.");
        ((ConfigurableApplicationContext) context).close();
    }
}
