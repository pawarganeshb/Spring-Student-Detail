package com.app;

public class Address {
	//	POJO class
	private String city;
	private String contry;
	private int pin;
	private Students stu;
	
	//	Getter and setter methods
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getContry() {
		return contry;
	}
	public void setContry(String contry) {
		this.contry = contry;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public Students getStu() {
		return stu;
	}
	public void setStu(Students stu) {
		this.stu = stu;
	}
	
//	toStirng() methods override with Object class
	@Override
	public String toString() {
		return "Address [city=" + city + ", contry=" + contry + ", pin=" + pin + ", stu=" + stu + "]";
	}
	
	
	
}
