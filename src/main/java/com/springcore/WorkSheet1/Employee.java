package com.springcore.WorkSheet1;
import java.util.List;

public class Employee {
	
	private String name;
	private int age;
	private Address address;
	private List<Long> number;
	
	public String getName() {
		return name;
	}	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Long> getNumber() {
		return number;
	}
	public void setNumber(List<Long> number) {
		this.number = number;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Employee [\n name=" + name + ",\n age=" + age + ",\n address=" + address + ",\n number=" + number + "]";
	}
	
	

}
