package com.knot.Banking.Dto;

public class CustomerDto {
	private String customerName;
	private String customerMail;
	private String address;
	private String dob;
	private AccountDto accounts;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerMail() {
		return customerMail;
	}
	public void setCustomerMail(String customerMail) {
		this.customerMail = customerMail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public CustomerDto(String customerName, String customerMail, String address, String dob) {
		super();
		this.customerName = customerName;
		this.customerMail = customerMail;
		this.address = address;
		this.dob = dob;
	}
	public CustomerDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccountDto getAccounts() {
		return accounts;
	}
	public void setAccounts(AccountDto accounts) {
		this.accounts = accounts;
	}
	
	
	

}
