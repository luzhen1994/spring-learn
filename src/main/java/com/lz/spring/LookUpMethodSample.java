package com.lz.spring;

import com.lz.spring.bean.CommandManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LookUpMethodSample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/beans.xml");
        CommandManager manager = context.getBean("commandManager", CommandManager.class);
        Object result1 = manager.process(new Object());
        System.out.println(result1);
        Object result2 = manager.process(new Object());
        System.out.println(result2);
        ((ClassPathXmlApplicationContext) context).close();
    }
}
