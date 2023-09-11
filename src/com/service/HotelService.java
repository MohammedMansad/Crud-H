package com.service;

import java.util.List;

import com.hotel.Hotel;

interface HotelService {
	public List<Hotel>getItems();
	Integer add(Hotel e);
	Integer delete(Integer i);
	Integer update(Integer fId,Hotel h);
	
	

}
