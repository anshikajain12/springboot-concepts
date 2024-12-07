package com.springbootproject.annotation.conditionalannotations.conditionalonproperty;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "nosqlCon", value="enabled",havingValue = "true",matchIfMissing = false)
public class NoSQLConnection {
    NoSQLConnection(){
        System.out.println("Initialize of NQSQL");
    }
}
