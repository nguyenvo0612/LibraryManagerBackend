package com.librarymanager.backend.service;

import com.librarymanager.backend.dto.BorrowTicketDTO;
import com.librarymanager.backend.entity.BorrowTicket;
import com.librarymanager.backend.repository.BorrowTicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowTicketService {
    @Autowired
    private BorrowTicketRepository borrowTicketRepository;

    private List<BorrowTicket> getListOfBorrowTickets() {
        return borrowTicketRepository.findAll();
    }

    private void addBorrowTicket(BorrowTicketDTO borrowTicketDTO) {
        BorrowTicket borrowTicket = new BorrowTicket();
        borrowTicket.setReturnDate(borrowTicketDTO.getReturnDate());
        borrowTicketDTO.setUser(borrowTicketDTO.getUser());
        borrowTicketRepository.save(borrowTicket);
    }

    private void updateStatusBorrowTicketOVERDUE(Integer borrowTicketId) {
        BorrowTicket borrowTicket = borrowTicketRepository.getBorrowTicketByBorrowTicketId(borrowTicketId);
        borrowTicket.setStatus(2);
        borrowTicketRepository.save(borrowTicket);
    }

    private void updateStatusBorrowTicketRETURNED(Integer borrowTicketId) {
        BorrowTicket borrowTicket = borrowTicketRepository.getBorrowTicketByBorrowTicketId(borrowTicketId);
        borrowTicket.setStatus(0);
        borrowTicketRepository.save(borrowTicket);
    }

}
