package com.librarymanager.backend.service;

import com.librarymanager.backend.dto.BorrowingDetailDTO;
import com.librarymanager.backend.entity.BorrowTicket;
import com.librarymanager.backend.entity.BorrowingDetail;
import com.librarymanager.backend.repository.BorrowTicketRepository;
import com.librarymanager.backend.repository.BorrowingDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;

@Service
public class BorrowingDetailService {
    @Autowired
    private BorrowingDetailRepository borrowingDetailRepository;

    @Autowired
    private BorrowTicketRepository borrowTicketRepository;

    private List<BorrowingDetail> findAllBorrowingDetailByBorrowTicketId(Integer borrowTicketId) {
        BorrowTicket borrowTicket = borrowTicketRepository.getBorrowTicketByBorrowTicketId(borrowTicketId);
        return borrowingDetailRepository.findBorrowingDetailsByBorrowTicket(borrowTicket);
    }

    private void addBorrowingDetail(BorrowingDetailDTO borrowingDetailDTO) {
        BorrowingDetail borrowingDetail = new BorrowingDetail();
        borrowingDetail.setReturnActualDate(borrowingDetailDTO.getReturnActualDate());
        borrowingDetail.setBook(borrowingDetailDTO.getBook());
        borrowingDetail.setBorrowTicket(borrowingDetailDTO.getBorrowTicket());
        borrowingDetailRepository.save(borrowingDetail);
    }

}
