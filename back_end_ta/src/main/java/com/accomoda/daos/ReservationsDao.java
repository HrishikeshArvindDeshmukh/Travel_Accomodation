package com.accomoda.daos;

import org.springframework.data.jpa.repository.JpaRepository;


import com.accomoda.entities.Reservations;
//@Repository
public interface ReservationsDao extends JpaRepository<Reservations, Integer>{

	Reservations findById(int id);
	Reservations deleteReservationsById(int id);
	Reservations findByUserId(int userId);
	Reservations findResrevationsByUserId(int userId);
	
	
}
