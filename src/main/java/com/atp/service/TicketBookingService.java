package com.atp.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atp.dao.TicketBookingDao;
import com.atp.entities.Ticket;

@Service
public class TicketBookingService {
	
	@Autowired
	TicketBookingDao ticketbookingdao;

	public Ticket CreateTicket(Ticket ticket) {
		
	return	ticketbookingdao.save(ticket);
		
	}

	public Optional<Ticket> getTicketById(Integer ticketid) {
		
		return ticketbookingdao.findById(ticketid);
	}
    //  findAll method return type is iterable 
	public Iterable<Ticket> getAllTicket() {
		
		return ticketbookingdao.findAll();
	}

	public void deleteTicket(Integer ticketid) {
		
		ticketbookingdao.deleteById(ticketid);
	}

	public Ticket updateORsave(Ticket ticket) {
		
		ticketbookingdao.save(ticket);
		return ticket;
	}

	public List<Ticket> lowest(String source, String dest) {
		
		return ticketbookingdao.lowest(source, dest);
		
	}

	

	
	

}
