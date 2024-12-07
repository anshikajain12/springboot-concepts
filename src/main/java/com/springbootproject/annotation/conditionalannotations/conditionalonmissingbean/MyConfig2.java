package com.springbootproject.annotation.conditionalannotations.conditionalonmissingbean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig2 {
    @Bean(name="ConditionalOnMissingBean")
    @ConditionalOnMissingBean(MyBean2.class)
    public MyBean2 myBean() {
        return new MyBean2();
    }
}
