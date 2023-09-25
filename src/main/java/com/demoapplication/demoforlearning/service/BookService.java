// package com.demoapplication.demoforlearning.service;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.ComponentScan;
// import org.springframework.stereotype.Service;

// import com.demoapplication.demoforlearning.entity.Books;
// import com.demoapplication.demoforlearning.repo.BooksRepo;
// @ComponentScan("com.demoapplication.demoforlearning")

// public interface BookService {
//     Books saveBooks(Books Books);
 
//     // Read operation
//     List<Books> fetchBooksList();
 
//     // Update operation
//     Books updateBooks(Books Books,Long BooksId);
 
//     // Delete operation
//     void deleteBooksById(Long BooksId);
// }
// // @Service
// // public class BookService{

// //     private BooksRepo booksRepo;
// //     @Autowired
// //     public BookService(BooksRepo booksRepo) {
// //         this.booksRepo = booksRepo;
// //     }

// //     public Books saveBooks(Books department)
// //     {
// //         return booksRepo.save(department);
// //     }
 
// //     // Read operation
// //     // @Override 
// //     public List<Books> fetchBooksList()
// //     {
// //         return  booksRepo.findAll();
// //     }
     
// // }