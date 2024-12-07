package com.springbootproject.annotation.conditionalannotations.conditionalonproperty;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "sqlCon", value="enabled",havingValue = "true",matchIfMissing = false)
public class SQLConnection {
    SQLConnection(){
        System.out.println("Initialize of SQL");
    }
}
