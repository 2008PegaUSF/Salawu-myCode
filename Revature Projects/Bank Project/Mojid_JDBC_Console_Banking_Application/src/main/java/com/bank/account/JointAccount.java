package com.bank.account;

import com.bank.customer.Customer;

public class JointAccount extends Customer{

	private static final long serialVersionUID = 12345L;
	public JointAccount(int customerid, String username, String password, String firstname, String lastname,
			String birthdate, String streetaddress, String city, String state, int zipcode, String phonenumber,
			double savingsaccountbalance, double checkingaccountbalance, double jointaccountbalance) {
		super(customerid, username, password, firstname, lastname, birthdate, streetaddress, city, state, zipcode, phonenumber,
				savingsaccountbalance, checkingaccountbalance, jointaccountbalance);
		// TODO Auto-generated constructor stub
	}
	//Create a depositing method so the user can deposit into the appropriate account, cannot deposit negative number
	public double depositJoint (double deposit) {
		if (deposit < 0) {
			System.out.println("Cannot Deposit a negative amount, consider the withdrawal option");
		}
		return getJointaccountbalance1();	
	}	
	
	//Create a withdrawal method so the user can withdraw out of the appropriate account, cannot overdraft
	public double withdrawJoint (double withdraw) {
		if (withdraw > getJointaccountbalance1()) {
			System.out.println("Inssufficient Funds, withdraw amount greater than the Savings Account Balance");
		}
		return getJointaccountbalance1();
	}
	
}
