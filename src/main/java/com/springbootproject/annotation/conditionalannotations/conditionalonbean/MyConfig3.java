package com.springbootproject.annotation.conditionalannotations.conditionalonbean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class MyConfig3 {
    @Bean
    @ConditionalOnBean(DataSource.class)
    public MyRepository myRepository() {
        return new MyRepository();
    }
    //The MyRepository bean is created only if a DataSource bean exists in the context.
}
