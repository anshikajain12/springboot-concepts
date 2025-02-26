package com.spring.springsecurity.bankExample.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {
    @GetMapping(value = "/home")
    public String getMsg() {
        //everyone can access it.
        // security not required.
        return "Welcome To Bank..!!";
    }

    @GetMapping(value = "/balance")
    public String getBalance() {
        //only acount holder can access it.
        return "Your current balance is: 4578 INR.";
    }

    @GetMapping(value = "/statement")
    public String getStatement() {
        //only bank employer can access it.
        return "Your Statement Generated and sent to your email.";
    }
}
