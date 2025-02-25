package com.springboot.exceptionhandling.controller;

import com.springboot.exceptionhandling.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/findPriceById")
    public String getPriceById(@RequestParam("bookId") String bookId, Model model) {
        Double priceById = bookService.findPriceById(bookId);
        model.addAttribute("price", "Book Price:: " + priceById);
        return "display";
    }
}
