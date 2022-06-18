package com.fabiomattosgodoy.biblioteca.mapper;

import com.fabiomattosgodoy.biblioteca.dto.BookDTO;
import com.fabiomattosgodoy.biblioteca.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book toModel(BookDTO bookDTO);

    BookDTO toDTO(Book book);
}
