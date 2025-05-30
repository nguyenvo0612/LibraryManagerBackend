package com.librarymanager.backend.mapper;

import com.librarymanager.backend.dto.BookDTO;
import com.librarymanager.backend.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface BookMapper {
    @Mappings({
            @Mapping(target = "bookId", ignore = true),
            @Mapping(target = "createdAt", ignore = true)
    })
    Book toEntity(BookDTO bookDTO);

    BookDTO toDTO(Book book);
}
