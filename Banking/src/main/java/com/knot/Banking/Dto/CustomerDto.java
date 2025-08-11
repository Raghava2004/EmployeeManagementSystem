package com.knot.Banking.Dto;

public class CustomerDto {
	private String CustomerName;
	private String CustomerMail;
	private String Address;
	private String DOB;
	private String CreatedAt;
	public CustomerDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerDto(String customerName, String customerMail, String address, String dOB, String createdAt) {
		super();
		CustomerName = customerName;
		CustomerMail = customerMail;
		Address = address;
		DOB = dOB;
		CreatedAt = createdAt;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getCustomerMail() {
		return CustomerMail;
	}
	public void setCustomerMail(String customerMail) {
		CustomerMail = customerMail;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getCreatedAt() {
		return CreatedAt;
	}
	public void setCreatedAt(String createdAt) {
		CreatedAt = createdAt;
	}
	
}
