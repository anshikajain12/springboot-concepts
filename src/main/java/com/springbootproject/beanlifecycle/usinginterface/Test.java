package com.springbootproject.beanlifecycle.usinginterface;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        // Load Spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com/springbootproject/beanlifecycle/usinginterface/config.xml");

        // Retrieve the bean from the context
        Pepsi p1 = (Pepsi) context.getBean("p1");

        // Display bean details
        System.out.println(p1);

        // Close the context to invoke destroy-method
//        context.close();
        context.registerShutdownHook();
    }
}
