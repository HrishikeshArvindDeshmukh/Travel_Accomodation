package com.accomoda.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accomoda.daos.ReservationsDao;
import com.accomoda.entities.Reservations;

@Transactional
@Service
public class ReservationsServiceImpl {

	@Autowired
	private ReservationsDao reservationsDao; 
	
	public List<Reservations> findAllReservations() {
		return reservationsDao.findAll();
	}
	
	public Reservations findResrevationsById(int id) {
		return reservationsDao.findById(id);
	}
	

	
	public Reservations save(Reservations reservations) {
		return reservationsDao.save(reservations);
	}
	
	public int deleteReservationsById(int id) {
		if(reservationsDao.existsById(id)) {
			reservationsDao.deleteById(id);
			return 1;
		}
		return 0;
	}

	public List<Reservations> findResrevationsByUserId(Iterable<Integer> userId) {
		return reservationsDao.findAllById(userId);
	}
}
