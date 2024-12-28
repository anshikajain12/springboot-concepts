package com.springbootproject.annotation.asyncAnnotation.useCase2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/own2/")
public class UserController2 {
    @Autowired
    UserService userService;

    @GetMapping(path = "/getuser")
    public String getUserMethod() {
        System.out.println("Inside user method from own: " + Thread.currentThread().getName());
        userService.asyncMethodOfOwnThreadPool();
        return "";
    }
}
