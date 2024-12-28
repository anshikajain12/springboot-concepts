package com.springbootproject.annotation.asyncAnnotation.useCase4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/own4/")
public class UserController4 {
    @Autowired
    UserService4 userService;

    @GetMapping(path = "/getuser")
    public String getUserMethod() {
        System.out.println("Inside user method from own java one: " + Thread.currentThread().getName());
        userService.asyncMethodOfOwnThreadPool();
        return "";
    }
}
