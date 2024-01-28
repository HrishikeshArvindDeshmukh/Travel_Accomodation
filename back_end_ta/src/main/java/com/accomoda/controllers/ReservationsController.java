package com.accomoda.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accomoda.entities.Reservations;
import com.accomoda.services.ReservationsServiceImpl;

@Controller
public class ReservationsController {

	@Autowired
	private ReservationsServiceImpl reservationsService;
	
	@GetMapping("/reservations/getAll")
	public @ResponseBody List<Reservations> findAll() {
		List<Reservations> result = reservationsService.findAllReservations();
		return result;
	}
	
	@GetMapping("/reservations/getByReservationId/{id}")
	public @ResponseBody Object findById(@PathVariable("id") int id) {
		Reservations result = reservationsService.findResrevationsById(id);
		if(result == null)
			return "Reservation not found";
		return result;
	}
	@GetMapping("/reservations/getAllByUserId/{UserId}")
	public @ResponseBody List<Reservations> findAllByUserId() {
		List<Reservations> result = reservationsService.findAllReservations();
		return result;
	}
	
	
	@GetMapping("/reservations/getAllByHotelId/{HotelId}")
	public @ResponseBody List<Reservations> findAllByHotelId() {
		List<Reservations> result = reservationsService.findAllReservations();
		return result;
	}
	@PostMapping("/reservations")
	public @ResponseBody Reservations save(@RequestBody Reservations reservations) {
		Reservations result = reservationsService.save(reservations);
		return result;
	}
	
	
//	
	@DeleteMapping("/reservations/{id}")
	public @ResponseBody String deleteReservationsById(@PathVariable("id") int id) {
		int count = reservationsService.deleteReservationsById(id);
		return "Records Deleted: " + count;
	}
}
