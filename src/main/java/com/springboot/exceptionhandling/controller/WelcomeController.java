package com.springboot.exceptionhandling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
    @RequestMapping(value = "/welcome")
    public String welcome(Model model) {
        model.addAttribute("msg", "Welcome to Exception Handling");
        String name = null;
        name.length(); //gives null pointer exception so we have to handle it
        return "welcome";
    }

    @ExceptionHandler(value = NullPointerException.class)
    public String handleNullPointerException(Model model) {
        model.addAttribute("errMsg", "Some Problem occured, Please try again later..!!");
        return "error";
    }
}
