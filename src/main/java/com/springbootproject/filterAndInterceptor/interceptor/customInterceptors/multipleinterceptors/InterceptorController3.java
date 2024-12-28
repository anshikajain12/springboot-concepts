package com.springbootproject.filterAndInterceptor.interceptor.customInterceptors.multipleinterceptors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/custom34/")
public class InterceptorController3 {
    @Autowired
    UserDD user;
    @GetMapping(path = "/getuser")
    public String getUser(){
        user.getUser();
        return "success";
    }
}
