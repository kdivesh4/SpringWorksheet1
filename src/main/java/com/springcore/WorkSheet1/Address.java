package com.springcore.WorkSheet1;

public class Address {
	
	private String streetNumber;
	private String city;
	private String country;
	
	public String getstreetNumber() {
		return streetNumber;
	}
	public void setstreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Address [streetNumber=" + streetNumber + ", city=" + city + ", country=" + country + "]";
	}
	
	
	
}
