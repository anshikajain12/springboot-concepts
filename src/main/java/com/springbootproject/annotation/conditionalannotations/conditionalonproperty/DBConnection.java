package com.springbootproject.annotation.conditionalannotations.conditionalonproperty;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class DBConnection {
    @Autowired(required = false)
    NoSQLConnection noSQLConnection;
    @Autowired(required = false)
    SQLConnection sqlConnection;
    @PostConstruct
    public void init(){
        System.out.println("DB connection bean is craeted....");
        System.out.println("is SQL Connection object is null: "+ Objects.isNull(sqlConnection));
        System.out.println("is NOSQL Connection object is null: "+ Objects.isNull(noSQLConnection));
    }
}
