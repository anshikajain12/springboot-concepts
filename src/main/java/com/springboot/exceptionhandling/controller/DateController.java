package com.springboot.exceptionhandling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class DateController {
    @RequestMapping(value = "/date")
    public String displayDate(Model model) {
        model.addAttribute("dateMsg", "Today Date :: " + new Date());
        System.out.println("Date: "+new Date());
        String s = null;
        s.length();
        return "date"; //logical file name
    }
}
