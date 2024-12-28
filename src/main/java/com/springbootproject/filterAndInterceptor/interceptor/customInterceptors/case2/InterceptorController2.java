package com.springbootproject.filterAndInterceptor.interceptor.customInterceptors.case2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/custom2/")
public class InterceptorController2 {
    @Autowired
    User2 user;
    @GetMapping(path = "/getuser")
    public String getUser(){
        user.getUser();
        return "success 2";
    }
}
