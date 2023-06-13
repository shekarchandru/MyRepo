package com.gl.abstraction;

public class MyAccount implements CreditCard,DebitCard{

	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		System.out.println("Calculated Interest..");
		//score = 120;
	}

	@Override
	public void openAccount() {
		// TODO Auto-generated method stub
		System.out.println("Account Opened");
	}

	@Override
	public void closeAccount() {
		// TODO Auto-generated method stub
		System.out.println("Account Closure started");
	}

	@Override
	public void createPolicy() {
		// TODO Auto-generated method stub
		System.out.println("Policy Generated ..");
	}

	@Override
	public void terminatePolicy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculatePremium() {
		// TODO Auto-generated method stub
		System.out.println("Premium Calculated....");
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Balance is ......");
	}

	@Override
	public void withdrawAmt() {
		// TODO Auto-generated method stub
		System.out.println("Withdrawal Successful....");
	}

	@Override
	public void depositAMount() {
		// TODO Auto-generated method stub
		System.out.println("Amount Deposited successfully");
	}

	@Override
	public void calculateOutstanding() {
		// TODO Auto-generated method stub
		System.out.println("Outstanding calculated is ....");
	}
	
	

}
