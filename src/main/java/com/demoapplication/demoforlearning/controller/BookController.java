package com.demoapplication.demoforlearning.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demoapplication.demoforlearning.entity.Books;
import com.demoapplication.demoforlearning.repo.BooksRepo;
// import com.demoapplication.demoforlearning.service.BookService;


@RestController
public class BookController {
        @Autowired
        private BooksRepo booksRepo;
   
        // private BookService booksService;
    //  @Autowired
    // public BookController(BookService booksService) {
    //         this.booksService = booksService;
    //     }

    // Save operation
    @PostMapping("/books")
    public Books  saveBooksId(
        
       @Validated
        @RequestBody Books Books)
    {
        return  booksRepo.save(Books);
    }
 
    // Read operation
    @GetMapping("/books")
    public List<Books> fetchBooksIdList()
    {
        return booksRepo.findAll();
    }
 
  
}
