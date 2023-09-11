package com.Dao;

import java.util.Iterator;
import java.util.List;

import com.Database.HotelDataBase;
import com.hotel.Hotel;

public class HotelDaoImpl implements HotelDao {

	@Override
	public List<Hotel> getItems() {
		// TODO Auto-generated method stub
		
		return HotelDataBase.hotelList;
	}

	@Override
	public Integer add(Hotel e) {
		// TODO Auto-generated method stub
		HotelDataBase.hotelList.add(e);
		return 1;
	}

	@Override
	public Integer delete(Integer id) {
		// TODO Auto-generated method stub
		Iterator<Hotel> iterator = HotelDataBase.hotelList.iterator();
		while(iterator.hasNext())
		{
			Hotel fid = iterator.next();
			if(fid.getfId()==id)
			{
				iterator.remove();
			}
		}
		return 1;
	}

	@Override
	public Integer update(Integer fid, Hotel h) {
		// TODO Auto-generated method stub
		HotelDataBase.hotelList.set(fid, h);
		return 1;
	}

}
