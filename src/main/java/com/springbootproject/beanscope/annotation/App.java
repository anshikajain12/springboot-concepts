package com.springbootproject.beanscope.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load Spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com/springbootproject/beanscope/annotation/config.xml");
        Student s1 = (Student) context.getBean("ob");
        System.out.println(s1.hashCode());
        Student s2 = (Student) context.getBean("ob");
        System.out.println(s2.hashCode());
    }
}
