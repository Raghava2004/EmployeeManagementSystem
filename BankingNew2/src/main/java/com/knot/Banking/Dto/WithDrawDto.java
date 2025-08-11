package com.knot.Banking.Dto;

public class WithDrawDto {
	private String customerId;
	private String withDrawalAmount;
	public WithDrawDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WithDrawDto(String customerId, String withDrawalAmount) {
		super();
		this.customerId = customerId;
		this.withDrawalAmount = withDrawalAmount;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getWithDrawalAmount() {
		return withDrawalAmount;
	}
	public void setWithDrawalAmount(String withDrawalAmount) {
		this.withDrawalAmount = withDrawalAmount;
	}
	
}
