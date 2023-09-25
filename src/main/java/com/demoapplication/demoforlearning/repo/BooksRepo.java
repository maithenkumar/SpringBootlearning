package com.demoapplication.demoforlearning.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demoapplication.demoforlearning.entity.Books;
@Repository
public interface BooksRepo extends JpaRepository<Books, Long> {

}