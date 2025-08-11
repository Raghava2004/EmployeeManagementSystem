package com.knot.Banking.Model;

import java.time.LocalDate;

import com.knot.Banking.Dto.CardsDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Cards")
public class CardModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "card_id")
	private Integer cardId;
	@Column(name = "account_id")
	private Integer accountId;
	@Column(name = "card_num")
	private Integer cardNumber;
	@Column(name = "card_type")
	private String cardType;
	@Column(name = "card_expiry")
	private LocalDate cardExpiry;
	@Column(name = "card_cvv")
	private Integer cardCvv;
	public CardModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CardModel(Integer cardId, Integer accountId, Integer cardNumber, String cardType, LocalDate cardExpiry,
			Integer cardCvv) {
		super();
		this.cardId = cardId;
		this.accountId = accountId;
		this.cardNumber = cardNumber;
		this.cardType = cardType;
		this.cardExpiry = cardExpiry;
		this.cardCvv = cardCvv;
	}
	public CardModel(Integer accountId2, CardsDto cardDto) {
		// TODO Auto-generated constructor stub
		this.accountId=accountId2;
		this.cardNumber=Integer.valueOf(cardDto.getCardNum());
		this.cardType=cardDto.getCardType();
		this.cardExpiry=LocalDate.parse(cardDto.getCardExpiry());
		this.cardCvv=Integer.valueOf(cardDto.getCardCvv());
		
	}
	public Integer getCardId() {
		return cardId;
	}
	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public Integer getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(Integer cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public LocalDate getCardExpiry() {
		return cardExpiry;
	}
	public void setCardExpiry(LocalDate cardExpiry) {
		this.cardExpiry = cardExpiry;
	}
	public Integer getCardCvv() {
		return cardCvv;
	}
	public void setCardCvv(Integer cardCvv) {
		this.cardCvv = cardCvv;
	}

}
