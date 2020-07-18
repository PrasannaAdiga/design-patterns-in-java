package com.java.abstract_factory.factory;

import com.java.abstract_factory.abstract_factory.CreditCardFactory;
import com.java.abstract_factory.credit.card.CreditCard;
import com.java.abstract_factory.credit.validator.Validator;
import com.java.abstract_factory.enums.CardType;
import com.java.abstract_factory.visa.card.VisaBlackCreditCard;
import com.java.abstract_factory.visa.card.VisaGoldCreditCard;
import com.java.abstract_factory.visa.validator.VisaGoldValidator;

public class VisaFactory extends CreditCardFactory {

	//returns requested Gold or Platinum credit card
	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
			case GOLD:
				return new VisaGoldCreditCard();
			case PLATINUM:
				return new VisaBlackCreditCard();
		}
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		return new VisaGoldValidator();
	}

}
