package com.librarymanager.backend.service;

import com.librarymanager.backend.dto.BookImageDTO;
import com.librarymanager.backend.entity.Book;
import com.librarymanager.backend.entity.BookImage;
import com.librarymanager.backend.repository.BookImageRepository;
import com.librarymanager.backend.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class BookImageService {
    @Autowired
    private BookImageRepository bookImageRepository;
    @Autowired
    private BookRepository bookRepository;

    public void addBookImage(BookImageDTO bookImageDTO) {
        BookImage bookImage = new BookImage();
        bookImage.setBook(bookImageDTO.getBook());
        bookImage.setImageUrl(bookImageDTO.getImageUrl());
        bookImageRepository.save(bookImage);
    }

    public List<BookImage> getBookImgByBookId(Integer bookId) {
        Book book = bookRepository.findBooksByBookId(bookId);
        return bookImageRepository.findBookImageByBook(book);
    }
}
