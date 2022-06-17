package com.fabiomattosgodoy.biblioteca.service;

import com.fabiomattosgodoy.biblioteca.dto.MessageResponseDTO;
import com.fabiomattosgodoy.biblioteca.entity.Book;
import com.fabiomattosgodoy.biblioteca.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(Book book) {
        Book saveBook = bookRepository.save(book);
        return MessageResponseDTO.builder()
                .message("Livro criado com Id = " + saveBook.getId())
                .build();
    }

}
