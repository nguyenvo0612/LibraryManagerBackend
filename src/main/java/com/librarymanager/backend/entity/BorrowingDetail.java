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
@Entity(name = "borrowing_details ")
public class BorrowingDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "borrowing_detail_id")
    private Integer borrowingDetailId;
    @Column(name = "return_actual_date")
    private LocalDateTime returnActualDate;
    @Column(name = "late_fee", columnDefinition = "DOUBLE DEFAULT(0)")
    private Double lateFee;
    @Column(name = "lost", columnDefinition = "BOOLEAN DEFAULT(0)")
    private Boolean lost;
    @Column(name = "loss_fee", columnDefinition = "DOUBLE DEFAULT(0)")
    private Double lossFee;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
    @ManyToOne
    @JoinColumn(name = "borrow_ticket_id")
    private BorrowTicket borrowTicket;

}
