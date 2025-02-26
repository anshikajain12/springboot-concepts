package com.spring.springsecurity.bankExample.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
    @GetMapping(value = "/welcome")
    public String getMessage() {
        return "Welcome To rest controller class!!";
    }
}
