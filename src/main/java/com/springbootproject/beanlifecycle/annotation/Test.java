package com.springbootproject.beanlifecycle.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        // Load Spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com/springbootproject/beanlifecycle/annotation/config.xml");

        // Retrieve the bean from the context
        Example example = (Example) context.getBean("p1");

        // Display bean details
        System.out.println(example);

        // Close the context to invoke destroy-method
//        context.close();
        context.registerShutdownHook();
    }
}
