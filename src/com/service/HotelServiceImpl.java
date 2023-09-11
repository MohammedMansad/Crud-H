package com.service;

import java.util.Iterator;
import java.util.List;

import com.Dao.HotelDaoImpl;
import com.hotel.Hotel;

public class HotelServiceImpl implements HotelService {

	@Override
	public List<Hotel> getItems() {
		// TODO Auto-generated method stub
		HotelDaoImpl hdaoImpl=new HotelDaoImpl();
		
		return hdaoImpl.getItems();
	}

	@Override
	public Integer add(Hotel e) {
		// TODO Auto-generated method stub
		int status=1;
		HotelDaoImpl hdaoImpl=new HotelDaoImpl();
		List<Hotel> items = hdaoImpl.getItems();
		Iterator<Hotel> iterator = items.iterator();
		while(iterator.hasNext())
		{
			Hotel h = iterator.next();
			if(h.getfId()==e.getfId())
			{
				status=0;
			}
		}
		if(status>0)
		{
			 hdaoImpl.add(e);
		}
		
		return status;
	}

	@Override
	public Integer delete(Integer i) {
		// TODO Auto-generated method stub
		int status=0;
		HotelDaoImpl hdaoImpl=new HotelDaoImpl();
		List<Hotel> items = hdaoImpl.getItems();
		Iterator<Hotel> iterator = items.iterator();
		while(iterator.hasNext())
		{
			Hotel fid = iterator.next();
			if(fid.getfId()==i)
			{
				status=1;
			}
		}
		if(status>0)
		{
			hdaoImpl.delete(i);
		}
		return status;
	}

	@Override
	public Integer update(Integer fId, Hotel h) {
		// TODO Auto-generated method stub
	int status=0;
	HotelDaoImpl hdaoImpl=new HotelDaoImpl();
	List<Hotel> items = hdaoImpl.getItems();
	Iterator<Hotel> iterator = items.iterator();
	while(iterator.hasNext())
	{
		Hotel id = iterator.next();
		if(id.getfId()==h.getfId())
		{
			status=1;
		}
	}
	if(status>0)
	{
		hdaoImpl.update(fId, h);
	}
		
		return status;
	}

}
