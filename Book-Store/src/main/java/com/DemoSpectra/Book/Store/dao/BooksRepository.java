package com.DemoSpectra.Book.Store.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DemoSpectra.Book.Store.entity.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books,Long>{
       Books findBooksById(Long id);
}
