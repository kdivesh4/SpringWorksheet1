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
	
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address(String streetNumber, String city, String country) {
		super();
		this.streetNumber = streetNumber;
		this.city = city;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [streetNumber=" + streetNumber + ", city=" + city + ", country=" + country + "]";
	}
	
	
	
}
