package com.librarymanager.backend.repository;

import com.librarymanager.backend.entity.Book;
import com.librarymanager.backend.entity.BookImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookImageRepository extends JpaRepository<BookImage, Integer> {
    List<BookImage> findBookImageByBook(Book book);
}
