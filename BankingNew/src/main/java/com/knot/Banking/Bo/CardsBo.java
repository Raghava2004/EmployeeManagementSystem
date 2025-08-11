package com.knot.Banking.Bo;

import com.knot.Banking.Model.CardModel;

public class CardsBo {
	
	private String cardNum;
	private String cardType;
	private String cardExpiry;
	private String cardCvv;

	public CardsBo(CardModel card) {
		// TODO Auto-generated constructor stub
		this.cardNum=card.getCardNumber().toString();
		this.cardType=card.getCardType();
		this.cardExpiry=card.getCardExpiry().toString();
		this.cardCvv=card.getCardCvv().toString();
	}

	public CardsBo(String cardNum, String cardType, String cardExpiry, String cardCvv) {
		super();
		this.cardNum = cardNum;
		this.cardType = cardType;
		this.cardExpiry = cardExpiry;
		this.cardCvv = cardCvv;
	}

	public CardsBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCardExpiry() {
		return cardExpiry;
	}

	public void setCardExpiry(String cardExpiry) {
		this.cardExpiry = cardExpiry;
	}

	public String getCardCvv() {
		return cardCvv;
	}

	public void setCardCvv(String cardCvv) {
		this.cardCvv = cardCvv;
	}

}
