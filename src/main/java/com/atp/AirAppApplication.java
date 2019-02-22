package com.atp;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.atp.entities.Ticket;
import com.atp.service.TicketBookingService;
import com.atp.swagger.Swaggerconfig;

@Import(Swaggerconfig.class)
@SpringBootApplication
public class AirAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirAppApplication.class, args);
		
	//ConfigurableApplicationContext applicationContext =SpringApplication.run(AirAppApplication.class, args);
	// get instance of service class
	// we are creating ticket in db without controller for testing purpose
	
	/*TicketBookingService ticketBookingService =applicationContext.getBean("ticketBookingService",TicketBookingService.class);
	     Ticket ticket= new Ticket();
	     ticket.setBookingDate(new Date());
	     ticket.setDestStation("mum");
	     ticket.setSourceStation("pune");
	     ticket.setPassengerName("atul");
	     ticket.setEmail("inputatp@gmail.com");
	     
	
	     ticketBookingService.CreateTicket(ticket);*/
	
	
	}

}

