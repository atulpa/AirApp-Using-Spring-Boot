package com.atp.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atp.entities.Ticket;
import com.atp.service.TicketBookingService;

@RestController
@RequestMapping(value = "/api")
public class TicketBookingController {

	@Autowired
	TicketBookingService ticketbookingservice;

	@PostMapping(value = "/create") // simply it is post method to create ticket in db
									// @ RequestBody json to java object
	public Ticket createTicket(@RequestBody Ticket ticket) {

		return ticketbookingservice.CreateTicket(ticket);

	}

	@GetMapping(value = "/get/ticket/{ticketId}")
	public Optional<Ticket> getTicketById(@PathVariable("ticketId") Integer ticketid) {

		return ticketbookingservice.getTicketById(ticketid);

	}
	@GetMapping(value = "/admin/ticket/all")
	public Iterable<Ticket> getAllTicket(){
		
		return ticketbookingservice.getAllTicket();
		
		
		
	}
	
	@DeleteMapping(value = "/getticket/{ticketId}")
	public void deleteTicket(@PathVariable("ticketId") Integer ticketid) {
		
		ticketbookingservice.deleteTicket(ticketid);
		
	}
	
	@PutMapping(value="/update")
	public ResponseEntity<Ticket> updateORsave(@RequestBody Ticket ticket){
		
		HttpHeaders header= new HttpHeaders();
		header.add("h1", "this is header generated by devloper");
		
	Ticket	t=ticketbookingservice.updateORsave(ticket);
		return new ResponseEntity<Ticket>(t,header,HttpStatus.ACCEPTED);	
		
	}
	
	@GetMapping(value = "/get/lowest/{source}/{dest}")
	public List<Ticket> lowest(@PathVariable("source") String source, @PathVariable String dest) {

		return ticketbookingservice.lowest(source,dest);

	}

	
	
}