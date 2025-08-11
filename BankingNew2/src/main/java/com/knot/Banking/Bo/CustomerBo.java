package com.knot.Banking.Bo;

import com.knot.Banking.Model.CustomerModel;

public class CustomerBo {
	private String customerName;
	private String customerMail;
	private String customerAddress;
	private String customerDob;
	private AccountBo accountBo;
	public CustomerBo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerBo(String customerName, String customerMail, String customerAddress, String customerDob) {
		super();
		this.customerName = customerName;
		this.customerMail = customerMail;
		this.customerAddress = customerAddress;
		this.customerDob = customerDob;
	}
	public CustomerBo(CustomerModel customer) {
		// TODO Auto-generated constructor stub
		this.customerName=customer.getCustomerName();
		this.customerAddress=customer.getCustomerAddress();
		this.customerDob=customer.getDob().toString();
		this.customerMail=customer.getCustomerMail();
	}
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
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerDob() {
		return customerDob;
	}
	public void setCustomerDob(String customerDob) {
		this.customerDob = customerDob;
	}
	public AccountBo getAccountBo() {
		return accountBo;
	}
	public void setAccountBo(AccountBo accountBo) {
		this.accountBo = accountBo;
	}

}
