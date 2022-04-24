package com.springcore.WorkSheet1;
import java.util.List;

public class Employee {
	
	private String name;
	private int age;
	private Address address;
	private List<Long> number;
	
	//getter and setter methods for fields
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
	
	public Employee(String name, int age, Address address, List<Long> number) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.number = number;
	}
	@Override
	public String toString() {
		return "Employee [\n name=" + name + ",\n age=" + age + ",\n address=" + address + ",\n number=" + number + "]";
	}

}
