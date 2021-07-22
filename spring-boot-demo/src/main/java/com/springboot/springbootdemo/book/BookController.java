package com.springboot.springbootdemo.book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    public List<Book> getAllBook(){
        return Arrays.asList(
                new Book(1l,"Spring Boot Demo","Johny Tu")
        );
    }
}
