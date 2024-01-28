package com.accomoda.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accomoda.daos.HotelDao;
import com.accomoda.dtos.SearchHotelDTO;
import com.accomoda.entities.Hotel;

@Transactional
@Service 
public class HotelServiceImpl {
	
	@Autowired
	private HotelDao hotelDao;
	
	public List<Hotel> getAllHotels()
	{
		List<Hotel> list = hotelDao.findAll();
		return list;
	}
	
	public Hotel findHotelById(int id)
	{
		Optional<Hotel> hotel = hotelDao.findById(id);
		return hotel.orElse(null);	
	}
	
	public Hotel save(Hotel hotel) {
		return hotelDao.save(hotel);
	}
	
	public void deleteHotelById(int id)
	{
		hotelDao.deleteById(id);	
	}
	
	public List<Hotel> searchHotelList(SearchHotelDTO searchHotel){
		List<Hotel> hotelList = hotelDao.findHotelSearchList(searchHotel.getLocation(),searchHotel.getHotelType());
		return hotelList;
	}
	
}
