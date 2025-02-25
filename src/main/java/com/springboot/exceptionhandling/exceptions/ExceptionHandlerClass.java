package com.springboot.exceptionhandling.exceptions;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//This is a global exception handler
@Controller
@ControllerAdvice
public class ExceptionHandlerClass {
    @ExceptionHandler(value = NullPointerException.class)
    public String handleNullPointerException(Model model) {
        model.addAttribute("errMsg", "Some Problem occured, Please try after sometimes..!!");
        return "error";
    }

    @ExceptionHandler(value = NoBookFoundException.class)
    public String handleNoBookFoundException() {
        return "customError";
    }
}
