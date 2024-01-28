package com.accomoda.daos;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.accomoda.entities.Hotel;

public interface HotelDao extends JpaRepository<Hotel, Integer> {
	List<Hotel> findAll();
	List<Hotel> findByCity(String city);
	List<Hotel> findByCityAndIsHomestay(String city, boolean isHomestay);
	
	@Query("SELECT h FROM Hotel h WHERE h.city = ?1 AND h.isHomestay = ?2")
	List<Hotel> findHotelSearchList(String city,boolean isHomestay);
	
}
