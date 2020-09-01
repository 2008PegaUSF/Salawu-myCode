package com.bank.account;

import com.bank.customer.Customer;

public class CheckingAccount extends Customer {

	private static final long serialVersionUID = 12345L;
	public CheckingAccount(int customerid, String username, String password, String firstname, String lastname,
			String birthdate, String streetaddress, String city, String state, int zipcode, String phonenumber,
			double savingsaccountbalance, double checkingaccountbalance, double jointaccountbalance) {
		super(customerid, username, password, firstname, lastname, birthdate, streetaddress, city, state, zipcode, phonenumber,
				savingsaccountbalance, checkingaccountbalance, jointaccountbalance);
		// TODO Auto-generated constructor stub
	}
	
	
	
	//Create a depositing method so the user can deposit into the appropriate account, cannot deposit negative number
	public double depositChecking (double deposit) {
		if (deposit < 0) {
			System.out.println("Cannot Deposit a negative amount, consider the withdrawal option");
		}
		return getCheckingaccountbalance1();
	}
	
	//Create a withdrawal method so the user can withdraw out of the appropriate account, cannot overdraft
	public double withdrawChecking (double withdraw) {
		if (withdraw > getCheckingaccountbalance1()) {
			System.out.println("Inssufficient Funds, withdraw amount greater than the Savings Account Balance");
		}
		return getCheckingaccountbalance1();
	}
	
		
	
}
