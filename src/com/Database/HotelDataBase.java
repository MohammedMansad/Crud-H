package com.Database;



import java.util.ArrayList;
import java.util.List;

import com.hotel.Hotel;

public class HotelDataBase {
	
	public static List<Hotel>hotelList=null;
	
	static
	{
		
		hotelList=new ArrayList<>();
		hotelList.add(new Hotel(1,"Dosa",10));
		hotelList.add(new Hotel(2,"idli",80));
		hotelList.add(new Hotel(3,"porata",20));
		hotelList.add(new Hotel(4,"chapathi",5));
	}

}
