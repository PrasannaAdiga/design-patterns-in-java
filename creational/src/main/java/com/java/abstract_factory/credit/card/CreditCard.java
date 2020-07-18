package com.java.abstract_factory.credit.card;

//class which provides basic contract for any CreditCard
public abstract class CreditCard {
	protected int cardNumberLength;
	protected int cscNumber;

	//setters and getters
	public int getCardNumberLength() {
		return cardNumberLength;
	}

	public void setCardNumberLength(int cardNumberLength) {
		this.cardNumberLength = cardNumberLength;
	}

	public int getCscNumber() {
		return cscNumber;
	}

	public void setCscNumber(int cscNumber) {
		this.cscNumber = cscNumber;
	}
	
}
