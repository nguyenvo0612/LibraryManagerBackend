package com.librarymanager.backend.dto;

import com.librarymanager.backend.entity.Book;
import com.librarymanager.backend.entity.BorrowTicket;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BorrowingDetailDTO {
    private LocalDateTime returnActualDate;
    private Book book;
    private BorrowTicket borrowTicket;
}
