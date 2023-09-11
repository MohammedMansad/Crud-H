package com.controller;

import com.hotel.Hotel;
import com.service.HotelServiceImpl;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//view
		HotelServiceImpl serviceImpl=new  HotelServiceImpl();
		serviceImpl.getItems().forEach(System.out::println);
		
		
		//add new item
		/*
		Hotel htl=new Hotel(5,"Biriyani",400);
		 Integer status = serviceImpl.add(htl);
		 if(status==0)
		 {
			 System.out.println("Not Added");
		 }
		 else
		 {
			 System.out.println("Added succesfully");
			 serviceImpl.getItems().forEach(System.out::println);
		 }
		 */
		
		//delete an item
		/*
		int fId=6;
		Integer status = serviceImpl.delete(fId);
		if(status==0)
		{
			System.out.println("Not Deleted");
			serviceImpl.getItems().forEach(System.out::println);
		}
		else
		{
			System.out.println("Deleted Succesfully");
			 serviceImpl.getItems().forEach(System.out::println);
		}
*/
		
		//update
		/*
		Hotel  htl=new Hotel();
		htl.setfId(1);
		htl.setfName("Ghee Rice");
		htl.setfPrice(190);
		Integer status = serviceImpl.update(0, htl);
		if(status==0)
		{
			System.out.println("Not updataed");
		}
		else
		{
			System.out.println("Updated Succesfully");
			 serviceImpl.getItems().forEach(System.out::println);
			
		}
		
		*/
		
		
		
	}

}
