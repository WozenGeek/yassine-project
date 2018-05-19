package com.yacine.project.entities;

public class Customer {
	
	//the Fields:
	private int customerID;
	private String customerName;
	private String adress;
	private String phone;
	
	//The properties:Getter And Setter
	public int getCustomerID() {
		return this.customerID;
	}
	
	public void setCustomerID(int id) {
		this.customerID=id;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	public void setCustomerName(String name) {
		this.customerName=name;
	}
	
	public String getAdress() {
		return this.adress;
	}
	public void setAdress(String adress) {
		this.adress=adress;
	}
	
	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	
	//Constructors:
	public Customer() {}
	
	public Customer(int id,String name,String adress,String phone) {
		this.customerID=id;
		this.customerName=name;
		this.adress=adress;
		this.phone=phone;
	}
	

}
