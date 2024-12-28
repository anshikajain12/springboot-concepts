package com.springbootproject.filterAndInterceptor.interceptor.customInterceptors.case1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/custom/")
public class InterceptorController {
    @Autowired
    User user;
    @GetMapping(path = "/getuser")
    public String getUser(){
        user.getUser();
        return "success";
    }
}
