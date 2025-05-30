package com.librarymanager.backend.repository;

import com.librarymanager.backend.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    Book findBooksByBookId(Integer bookId);
}
