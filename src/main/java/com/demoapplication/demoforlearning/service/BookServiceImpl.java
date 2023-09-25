// package com.demoapplication.demoforlearning.service;

// import java.util.List;
// import java.util.Objects;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.demoapplication.demoforlearning.entity.Books;
// import com.demoapplication.demoforlearning.repo.BooksRepo;
// @Service
// abstract public class BookServiceImpl  implements BookService  {
 
//     @Autowired
//     private BooksRepo booksRepo;
 
//     // Save operation
//     @Override
//     public Books saveBooks(Books department)
//     {
//         return booksRepo.save(department);
//     }
 
//     // Read operation
//     @Override public List<Books> fetchBooksList()
//     {
//         return (List<Books>)
//             booksRepo.findAll();
//     }
 
//     // Update operation
//     @Override
//     public Books
//     updateBooks(Books department,Long departmentId)
//     {
//         Books depDB
//             = booksRepo.findById(departmentId)
//                   .get();
 
//         if (Objects.nonNull(department.getBookName())
//             && !"".equalsIgnoreCase(
//                 department.getBookName())) {
//             depDB.setBookName(
//                 department.getBookName());
//         }
 
//         if (Objects.nonNull(
//                 department.getBookType())
//             && !"".equalsIgnoreCase(
//                 department.getBookType())) {
//             depDB.setBookType(
//                 department.getBookType());
//         }
 
//         if (Objects.nonNull(department.getDes())
//             && !"".equalsIgnoreCase(
//                 department.getDes())) {
//             depDB.setDes(
//                 department.getDes());
//         }
 
//         return booksRepo.save(depDB);
//     }
 
//     // Delete operation
//     @Override
//     public void deleteBooksById(Long departmentId)
//     {
//         booksRepo.deleteById(departmentId);
//     }
    
// }
