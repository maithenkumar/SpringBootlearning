package com.demoapplication.demoforlearning.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demoapplication.demoforlearning.entity.Books;
import com.demoapplication.demoforlearning.repo.BooksRepo;


@RestController
public class BookController {
     @Autowired 
    private BooksRepo bookRepo;

    @PostMapping("/addbook")
    public Books addUser(@RequestBody Books book) {
        return bookRepo.save(book);
    }
      
    // findAll method is predefine method in Mongo Repository 
    // with this method we will all user that is save in our database
    @GetMapping("/getallbook")
    public List<Books> getAllUser(){
        return bookRepo.findAll(); 
    }
}
