package com.gl.abstraction;

public interface BankingProcess {
	/*public void display()
	{
		
	}*/
	int score = 100;// by default it becomes final variable
	public void calculateInterest();
	public void openAccount();
	public void closeAccount();

}
