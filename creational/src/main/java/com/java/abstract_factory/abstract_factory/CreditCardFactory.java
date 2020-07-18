package com.java.abstract_factory.abstract_factory;

import com.java.abstract_factory.credit.card.CreditCard;
import com.java.abstract_factory.credit.validator.Validator;
import com.java.abstract_factory.enums.CardType;
import com.java.abstract_factory.factory.AmexFactory;
import com.java.abstract_factory.factory.VisaFactory;

//Abstract Factory which defines contract for concrete factories like AmexFactory or VisaFactory
public abstract class CreditCardFactory {

	//Factory method which returns AmexFactory or VisaFactory depending on the credit score
	public static CreditCardFactory getCreditCardFactory(int creditScore) {
		if(creditScore > 650) {
			return new AmexFactory();
		}
		else {
			return new VisaFactory();
		}
	}
	
	public abstract CreditCard getCreditCard(CardType cardType);
		
	public abstract Validator getValidator(CardType cardType);
}
