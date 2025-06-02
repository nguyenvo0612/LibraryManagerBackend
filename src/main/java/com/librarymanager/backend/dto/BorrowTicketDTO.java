package com.librarymanager.backend.dto;

import com.librarymanager.backend.entity.User;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BorrowTicketDTO {
    private LocalDateTime returnDate;
    private User user;
}
