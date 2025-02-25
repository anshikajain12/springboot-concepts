package com.springboot.exceptionhandling.service;

import com.springboot.exceptionhandling.exceptions.NoBookFoundException;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public Double findPriceById(String bookId) {
        if (bookId.equals("B101")) {
            return 450.00;
        } else {
            throw new NoBookFoundException("No Book found with given id: " + bookId);
        }
    }
}
