package com.demoapplication.demoforlearning.repo;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.demoapplication.demoforlearning.entity.Books;

public interface BooksRepo extends MongoRepository<Books,String>{

}
