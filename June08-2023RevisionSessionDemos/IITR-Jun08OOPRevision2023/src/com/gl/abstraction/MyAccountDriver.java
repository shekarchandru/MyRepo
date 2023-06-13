package com.gl.abstraction;

public class MyAccountDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyAccount mac = new MyAccount();
		mac.calculateInterest();
		mac.openAccount();
		mac.calculateInterest();
		mac.calculateOutstanding();
		mac.createPolicy();
		mac.calculatePremium();
		mac.checkBalance();
		mac.depositAMount();
		mac.withdrawAmt();
		mac.terminatePolicy();
		mac.closeAccount();
	}

}
