package com.Dao;

import java.util.List;

import com.hotel.Hotel;

interface HotelDao {

	public List<Hotel>getItems();
	Integer add(Hotel e);
	Integer delete(Integer id);
	Integer update(Integer fid,Hotel h);
}
