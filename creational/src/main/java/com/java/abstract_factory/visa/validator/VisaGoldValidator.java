package com.java.abstract_factory.visa.validator;

import com.java.abstract_factory.credit.card.CreditCard;
import com.java.abstract_factory.credit.validator.Validator;

//Validator for Visa Gold Credit Card
public class VisaGoldValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		return true;
	}

}
