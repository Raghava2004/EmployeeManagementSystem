package com.knot.Banking.Model;

import java.time.LocalDate;

import com.knot.Banking.Dto.CustomerDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class CustomerModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="customer_id")
	private Integer CustomerId;
	@Column(name="customer_name")
	private String CustomerName;
	@Column(name="customer_mail")
	private String CustomerMail;
	@Column(name="address")
	private String CustomerAddress;
	@Column(name="dob")
	private LocalDate dob;
	@Column(name="created_at")
	private LocalDate CreatedAt;
	public CustomerModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerModel(Integer customerId, String customerName, String customerMail, String customerAddress,
			LocalDate dob, LocalDate createdAt) {
		super();
		CustomerId = customerId;
		CustomerName = customerName;
		CustomerMail = customerMail;
		CustomerAddress = customerAddress;
		this.dob = dob;
		CreatedAt = createdAt;
	}
	public CustomerModel(CustomerDto customerDto) {
		// TODO Auto-generated constructor stub
		this.CustomerName=customerDto.getCustomerName();
		this.CustomerMail=customerDto.getCustomerMail();
		this.CustomerAddress=customerDto.getAddress();
		String dobInput=customerDto.getDob();
		this.dob=LocalDate.parse(dobInput);
		this.CreatedAt=LocalDate.now();
	}
	public Integer getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(Integer customerId) {
		CustomerId = customerId;
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
	public String getCustomerAddress() {
		return CustomerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public LocalDate getCreatedAt() {
		return CreatedAt;
	}
	public void setCreatedAt(LocalDate createdAt) {
		CreatedAt = createdAt;
	}
	

}
