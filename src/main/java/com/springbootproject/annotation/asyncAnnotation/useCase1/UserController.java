package com.springbootproject.annotation.asyncAnnotation.useCase1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/")
public class UserController {
    @Autowired
    UserDetails userDetails;

    @GetMapping(path = "/getuser")
    public String getUserMethod() {
        System.out.println("Inside user method: " + Thread.currentThread().getName());
        userDetails.asyncMethodTest();
        return "";
    }
}
