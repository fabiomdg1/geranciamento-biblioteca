package com.fabiomattosgodoy.biblioteca.repository;

import com.fabiomattosgodoy.biblioteca.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
    
}
