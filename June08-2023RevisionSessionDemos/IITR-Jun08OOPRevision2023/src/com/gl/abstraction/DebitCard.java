package com.gl.abstraction;

public interface DebitCard  extends BankingProcess{

	public void checkBalance();
	public void withdrawAmt();
	public void depositAMount();
}
