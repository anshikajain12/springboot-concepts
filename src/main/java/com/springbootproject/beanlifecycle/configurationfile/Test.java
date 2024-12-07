package com.springbootproject.beanlifecycle.configurationfile;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        // Load Spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com/springbootproject/beanlifecycle/configurationfile/config.xml");

        // Retrieve the bean from the context
        Samosa s1 = (Samosa) context.getBean("s1");

        // Display bean details
        System.out.println(s1);

        // Close the context to invoke destroy-method
//        context.close();
        context.registerShutdownHook();
    }
}
