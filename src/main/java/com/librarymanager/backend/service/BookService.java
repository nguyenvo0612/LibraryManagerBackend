package com.librarymanager.backend.service;

import com.librarymanager.backend.dto.BookDTO;
import com.librarymanager.backend.entity.Book;
import com.librarymanager.backend.mapper.BookMapper;
import com.librarymanager.backend.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    private BookMapper bookMapper;

    private void addBook(BookDTO bookDTO) {
        Book book = new Book();
        book = bookMapper.toEntity(bookDTO);
//        book.setAuthor(bookDTO.getAuthor());
//        book.setPrice(bookDTO.getPrice());
//        book.setTitle(bookDTO.getTitle());
//        book.setPublisher(bookDTO.getPublisher());
//        book.setYear(bookDTO.getYear());
//        book.setQuantity(bookDTO.getQuantity());
//        book.setCategory(bookDTO.getCategory());
        bookRepository.save(book);
    }

    private Book findBookById(Integer bookId) {
        return bookRepository.findBooksByBookId(bookId);
    }

    private void deleteBookById(Integer bookId) {
        bookRepository.deleteById(bookId);
    }

    private void updateBook(Integer bookId, BookDTO bookDTO) {
        Book book = bookRepository.findBooksByBookId(bookId);
//        book.setAuthor(bookDTO.getAuthor());
//        book.setPrice(bookDTO.getPrice());
//        book.setTitle(bookDTO.getTitle());
//        book.setPublisher(bookDTO.getPublisher());
//        book.setYear(bookDTO.getYear());
//        book.setQuantity(bookDTO.getQuantity());
//        book.setCategory(bookDTO.getCategory());
//        bookRepository.save(book);
        book = bookMapper.toEntity(bookDTO);
        bookRepository.save(book);
    }
}
