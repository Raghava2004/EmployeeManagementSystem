package com.knot.Banking.Dto;

public class DepositCashDto {
	private String customerId;
	private String depositAmount;
	public DepositCashDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DepositCashDto(String customerId, String depositAmount) {
		super();
		this.customerId = customerId;
		this.depositAmount = depositAmount;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(String depositAmount) {
		this.depositAmount = depositAmount;
	}
	
}
