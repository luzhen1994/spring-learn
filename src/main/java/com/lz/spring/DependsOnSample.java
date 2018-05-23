package com.lz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependsOnSample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/beans.xml");
    }
}
