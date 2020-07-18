package com.java.abstract_factory.credit.validator;

import com.java.abstract_factory.credit.card.CreditCard;

//class which provides basic contract for validating any CreditCard
public interface Validator {
	public boolean isValid(CreditCard creditCard);
}
