package com.librarymanager.backend.dto;

import com.librarymanager.backend.entity.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class BookDTO {
    private String title;
    private String author;
    private String publisher;
    private Integer year;
    private Integer quantity;
    private Double price;
    private Category category;
}
