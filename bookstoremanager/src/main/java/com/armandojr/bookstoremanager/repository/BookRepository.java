package com.armandojr.bookstoremanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.armandojr.bookstoremanager.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long> {
        
}
