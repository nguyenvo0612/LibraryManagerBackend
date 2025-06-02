package com.librarymanager.backend.repository;

import com.librarymanager.backend.entity.BorrowTicket;
import com.librarymanager.backend.entity.BorrowingDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BorrowingDetailRepository extends JpaRepository<BorrowingDetail, Integer> {
    List<BorrowingDetail> findBorrowingDetailsByBorrowTicket(BorrowTicket borrowTicket);
}
