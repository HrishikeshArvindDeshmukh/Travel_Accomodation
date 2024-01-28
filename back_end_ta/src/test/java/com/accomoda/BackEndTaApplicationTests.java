package com.accomoda;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accomoda.daos.HotelDao;
import com.accomoda.entities.Hotel;
import com.accomoda.services.HotelServiceImpl;

@SpringBootTest
class BackEndTaApplicationTests {
	
	@Autowired
	private HotelDao hotelDao;
	
	@Test
	void testFindAll() {
		
		List<Hotel> result = hotelDao.findHotelSearchList("Pune",false);
		result.forEach(System.out::println);
		//assertThat(list).isNotEmpty();
	}

}
