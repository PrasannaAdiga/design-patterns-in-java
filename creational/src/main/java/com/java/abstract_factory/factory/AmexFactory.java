package com.java.abstract_factory.factory;

import com.java.abstract_factory.abstract_factory.CreditCardFactory;
import com.java.abstract_factory.amex.card.AmexGoldCreditCard;
import com.java.abstract_factory.amex.card.AmexPlatinumCreditCard;
import com.java.abstract_factory.amex.validator.AmexGoldValidator;
import com.java.abstract_factory.amex.validator.AmexPlatinumValidator;
import com.java.abstract_factory.credit.card.CreditCard;
import com.java.abstract_factory.credit.validator.Validator;
import com.java.abstract_factory.enums.CardType;

public class AmexFactory extends CreditCardFactory {

	//returns requested Gold or Platinum credit card
	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
			case GOLD:
				return new AmexGoldCreditCard();
			case PLATINUM:
				return new AmexPlatinumCreditCard();
			default:
				break;
		}
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		switch (cardType) {
			case GOLD:
				return new AmexGoldValidator();
			case PLATINUM:
				return new AmexPlatinumValidator();
		
		}
		return null;
	}
}
