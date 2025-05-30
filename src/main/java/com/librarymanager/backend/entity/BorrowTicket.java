package com.librarymanager.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "borrow_tickets")
public class BorrowTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "borrow_ticket_id")
    private Integer borrowTicketId;
    @CreationTimestamp
    @Column(name = "borrow_date")
    private LocalDateTime borrowDate;
    @Column(name = "return_date")
    private LocalDateTime returnDate;
    @Column(name = "status", columnDefinition = "TINYINT(1) DEFAULT(1)")
    private Integer status;
    @CreationTimestamp
    @Column(name = "create_at")
    private LocalDateTime createAt;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
