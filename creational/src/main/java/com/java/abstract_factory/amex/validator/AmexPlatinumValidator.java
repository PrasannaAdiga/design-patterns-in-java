package com.java.abstract_factory.amex.validator;

import com.java.abstract_factory.credit.card.CreditCard;
import com.java.abstract_factory.credit.validator.Validator;

//Validator for Amex Platinum Credit Card
public class AmexPlatinumValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		return true;
	}

}
