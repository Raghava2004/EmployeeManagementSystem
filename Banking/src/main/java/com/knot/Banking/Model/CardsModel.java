package com.knot.Banking.Model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class CardsModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	@Column(name = "card_id")
	private Integer CardId;
	
	@Column(name = "account_id")
	private Integer AccountId;
	
	@Column(name = "card_num")
	private Integer CardNumber;
	
	@Column(name = "card_type")
	private String CardType;
	
	@Column(name = "card_expiry")
	private LocalDate CardExpiry;
	
	@Column(name = "cvv")
	private Integer CardCvv;

	public CardsModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CardsModel(Integer cardId, Integer accountId, Integer cardNumber, String cardType, LocalDate cardExpiry,
			Integer cardCvv) {
		super();
		CardId = cardId;
		AccountId = accountId;
		CardNumber = cardNumber;
		CardType = cardType;
		CardExpiry = cardExpiry;
		CardCvv = cardCvv;
	}

	public Integer getCardId() {
		return CardId;
	}

	public void setCardId(Integer cardId) {
		CardId = cardId;
	}

	public Integer getAccountId() {
		return AccountId;
	}

	public void setAccountId(Integer accountId) {
		AccountId = accountId;
	}

	public Integer getCardNumber() {
		return CardNumber;
	}

	public void setCardNumber(Integer cardNumber) {
		CardNumber = cardNumber;
	}

	public String getCardType() {
		return CardType;
	}

	public void setCardType(String cardType) {
		CardType = cardType;
	}

	public LocalDate getCardExpiry() {
		return CardExpiry;
	}

	public void setCardExpiry(LocalDate cardExpiry) {
		CardExpiry = cardExpiry;
	}

	public Integer getCardCvv() {
		return CardCvv;
	}

	public void setCardCvv(Integer cardCvv) {
		CardCvv = cardCvv;
	}


}
