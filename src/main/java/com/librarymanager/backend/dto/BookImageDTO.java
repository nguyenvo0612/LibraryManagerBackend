package com.librarymanager.backend.dto;

import com.librarymanager.backend.entity.Book;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BookImageDTO {

    private String imageUrl;
    private Book book;
}
