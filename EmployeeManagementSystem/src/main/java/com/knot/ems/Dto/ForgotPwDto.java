package com.knot.ems.Dto;

public class ForgotPwDto {
	private String mail;
	private String newPw;

	public ForgotPwDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ForgotPwDto(String mail, String newPw) {
		super();
		this.mail = mail;
		this.newPw = newPw;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNewPw() {
		return newPw;
	}

	public void setNewPw(String newPw) {
		this.newPw = newPw;
	}

	
	

}
