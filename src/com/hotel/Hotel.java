package com.hotel;

import java.util.Objects;

public class Hotel {
	
	
	private int fId;
	private String fName;
	private int fPrice;
	public int getfId() {
		return fId;
	}
	public void setfId(int fId) {
		this.fId = fId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public int getfPrice() {
		return fPrice;
	}
	public void setfPrice(int fPrice) {
		this.fPrice = fPrice;
	}
	public Hotel(int fId, String fName, int fPrice) {
		super();
		this.fId = fId;
		this.fName = fName;
		this.fPrice = fPrice;
	}
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Hotel [fId=" + fId + ", fName=" + fName + ", fPrice=" + fPrice + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(fId, fName, fPrice);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hotel other = (Hotel) obj;
		return fId == other.fId && Objects.equals(fName, other.fName) && Objects.equals(fPrice, other.fPrice);
	}
	

}
