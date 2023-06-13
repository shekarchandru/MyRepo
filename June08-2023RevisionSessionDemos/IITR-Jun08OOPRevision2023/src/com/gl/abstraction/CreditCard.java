package com.gl.abstraction;

public interface CreditCard extends BankingProcess, InsuranceProcess{

	public void calculateOutstanding();
}
