package com.springbootproject.beanscope.configure;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load Spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com/springbootproject/beanscope/configure/config.xml");
        Student s1 = context.getBean("s1", Student.class);
        System.out.println(s1.hashCode());
        System.out.println(s1.getName());
        Student s2 = context.getBean("s1", Student.class);
        System.out.println(s2.hashCode());
        System.out.println(s2.getName());

    }
}
