package com.knot.ems.Bo;

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
	public DepositCashDto(SalaryBo salaryById) {
		// TODO Auto-generated constructor stub
		this.customerId=salaryById.getEmpId();
		this.depositAmount=salaryById.getComputedSalary();
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
