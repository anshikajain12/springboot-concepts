package com.springbootproject.annotation.conditionalannotations.conditionalonexpression;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig4 {
    @Bean
    @ConditionalOnExpression("'${feature.flag}' == 'enabled'")
    public FeatureService featureService() {
        return new FeatureService();
    }
}
