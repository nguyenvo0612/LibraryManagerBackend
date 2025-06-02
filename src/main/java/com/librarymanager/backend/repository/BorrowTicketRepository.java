package com.librarymanager.backend.repository;

import com.librarymanager.backend.entity.BorrowTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowTicketRepository extends JpaRepository<BorrowTicket, Integer> {
    BorrowTicket getBorrowTicketByBorrowTicketId(Integer borrowTicketId);
}
