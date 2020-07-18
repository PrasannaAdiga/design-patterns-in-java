package com.java;

import com.java.abstract_factory.abstract_factory.CreditCardFactory;
import com.java.abstract_factory.credit.card.CreditCard;
import com.java.abstract_factory.enums.CardType;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		//request for a credit card by providing credit score
		CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);
		//request for a platinum credit card
		CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
		//check which type of credit card received, based on the credit score
		System.out.println(card.getClass());

		//request for a credit card by providing credit score
		abstractFactory = CreditCardFactory.getCreditCardFactory(600);
		//request for a gold credit card
		CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);
		//check which type of credit card received, based on the credit score
		System.out.println(card2.getClass());
	}

}
