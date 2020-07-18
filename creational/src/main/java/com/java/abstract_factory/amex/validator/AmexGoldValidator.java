package com.java.abstract_factory.amex.validator;

import com.java.abstract_factory.credit.card.CreditCard;
import com.java.abstract_factory.credit.validator.Validator;

//Validator for Amex Gold Credit Card
public class AmexGoldValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		return true;
	}

}
