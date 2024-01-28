package com.accomoda.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accomoda.dtos.Response;
import com.accomoda.dtos.SearchHotelDTO;
import com.accomoda.entities.Hotel;
import com.accomoda.services.HotelServiceImpl;

@CrossOrigin(origins = "*")
@RestController
public class HotelControllerImpl {
	
	@Autowired
	private HotelServiceImpl hotelService;
	
	@GetMapping("/hotel/gethotels")
	public @ResponseBody List<Hotel> getHotels(){
		
		List<Hotel> result = hotelService.getAllHotels();
		return result;
	}
	
	@GetMapping("/hotel/gethotel/{id}")
	public @ResponseBody Hotel getHotel(@PathVariable("id") int id){
		
		Hotel hotel = hotelService.findHotelById(id);
		return hotel;
	}
	
	
	@PostMapping("/hotel/addhotel")
	public @ResponseBody void save(@RequestBody Hotel hotel) {
		Hotel result = hotelService.save(hotel);
	}
	
	@PutMapping("/hotel/updatehotel")
	public @ResponseBody void updatehotel(@RequestBody Hotel hotel) {
		Hotel result = hotelService.save(hotel);
	}
	
	@DeleteMapping("hotel/deletehotel/{id}")
	public @ResponseBody void deletehotel(@PathVariable("id") int id){
		hotelService.deleteHotelById(id);
	}
	
	
	@PostMapping("/hotel/searchhotel/")
	public ResponseEntity<?> hotelSearchHotels(@RequestBody SearchHotelDTO searchHotel, Model model){
		List<Hotel> result = hotelService.searchHotelList(searchHotel);
		return Response.success(result);
	}
		
}
