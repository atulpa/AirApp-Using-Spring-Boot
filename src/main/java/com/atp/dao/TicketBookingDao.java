package com.atp.dao;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.atp.entities.Ticket;

@Repository// optional        
public interface TicketBookingDao extends CrudRepository<Ticket, Integer> {
	
	@Query(value="select t.email,t.booking_date,t.passenger_name,t.ticket_id,t.cost,t.source_station,t.dest_station from ticket t WHERE t.source_station=:source_station AND t.dest_station=:dest_station  order by t.cost asc"  ,nativeQuery=true)
	List<Ticket>lowest(@Param("source_station") String source, @Param("dest_station") String dest);

}


//select t.cost from ticket t WHERE t.source_station=:source_station AND t.dest_station=:dest_station  order by t.cost desc
//select t.email,t.booking_date,t.passenger_name,t.ticket_id,t.cost,t.source_station,t.dest_station from ticket t WHERE t.source_station=:source_station AND t.dest_station=:dest_station  order by t.cost asc