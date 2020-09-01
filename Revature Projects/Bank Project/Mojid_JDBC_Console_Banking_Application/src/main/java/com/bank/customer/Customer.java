package com.bank.customer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class Customer implements Serializable {

	/*
	  a new user can create their username and password
      an existing user can log in using their username and password
      create a bank account
      apply for a joint account
      withdraw, deposit, transfer between their account
      should be able to check balances
      overdrawing should not be allowed
      delete an account if it is empty
      be able to logout
      be able to execute multiple deposit, withdraw, transfer in the same session
      no negative withdraw should be allowed so we have to implement some sort of a constraint to negate that
	 */
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 12345L;
	private int customerid1;
	private String username1;
	private String password1;
	private String firstname1;
	private String lastname1;
	private String birthdate1;
	private String streetaddress1;
	private String city1;
	private String state1;
	private int zipcode1;
	private String phonenumber1;
	private double savingsaccountbalance1;
	private double checkingaccountbalance1;
	private double jointaccountbalance1;
	
	//Personal info required when the Customer opens their account
	public Customer (int customerid, String username, String password, String firstname, String lastname, String birthdate,
			String streetaddress, String city, String state, int zipcode, String phonenumber,
			double savingsaccountbalance, double checkingaccountbalance, double jointaccountbalance) {
		
		this.customerid1 = customerid;
		this.username1 = username;
		this.password1 = password;
		this.firstname1 = firstname;
		this.lastname1 = lastname;
		this.birthdate1 = birthdate;
		this.streetaddress1 = streetaddress;
		this.city1 = city;
		this.state1 = state;
		this.zipcode1 = zipcode;
		this.phonenumber1 = phonenumber;
		this.savingsaccountbalance1 = savingsaccountbalance;
		this.checkingaccountbalance1 = checkingaccountbalance;
		this.jointaccountbalance1 = jointaccountbalance;
		
	
	}

	public int getCustomerid1() {
		return customerid1;
	}

	public void setCustomerid1(int customerid1) {
		this.customerid1 = customerid1;
	}

	public String getUsername1() {
		return username1;
	}

	public void setUsername1(String username1) {
		this.username1 = username1;
	}

	public String getPassword1() {
		return password1;
	}

	public void setPassword1(String password1) {
		this.password1 = password1;
	}

	public String getFirstname1() {
		return firstname1;
	}

	public void setFirstname1(String firstname1) {
		this.firstname1 = firstname1;
	}

	public String getLastname1() {
		return lastname1;
	}

	public void setLastname1(String lastname1) {
		this.lastname1 = lastname1;
	}

	public String getBirthdate1() {
		return birthdate1;
	}

	public void setBirthdate1(String birthdate1) {
		this.birthdate1 = birthdate1;
	}

	public String getStreetaddress1() {
		return streetaddress1;
	}

	public void setStreetaddress1(String streetaddress1) {
		this.streetaddress1 = streetaddress1;
	}

	public String getCity1() {
		return city1;
	}

	public void setCity1(String city1) {
		this.city1 = city1;
	}

	public String getState1() {
		return state1;
	}

	public void setState1(String state1) {
		this.state1 = state1;
	}

	public int getZipcode1() {
		return zipcode1;
	}

	public void setZipcode1(int zipcode1) {
		this.zipcode1 = zipcode1;
	}

	public String getPhonenumber1() {
		return phonenumber1;
	}

	public void setPhonenumber1(String phonenumber1) {
		this.phonenumber1 = phonenumber1;
	}

	public double getSavingsaccountbalance1() {
		return savingsaccountbalance1;
	}

	public void setSavingsaccountbalance1(double savingsaccountbalance1) {
		this.savingsaccountbalance1 = savingsaccountbalance1;
	}

	public double getCheckingaccountbalance1() {
		return checkingaccountbalance1;
	}

	public void setCheckingaccountbalance1(double checkingaccountbalance1) {
		this.checkingaccountbalance1 = checkingaccountbalance1;
	}

	public double getJointaccountbalance1() {
		return jointaccountbalance1;
	}

	public void setJointaccountbalance1(double jointaccountbalance1) {
		this.jointaccountbalance1 = jointaccountbalance1;
	}

	
	public static void createCustomer () throws IOException {
		//This is to create a text file that will be named the Customer Name and we can save our customer information into this
		try {
			File customerName = new File("customerName.txt");
			if (customerName.createNewFile()) {
				System.out.println("Customer profile: "+customerName.getName()+" has been created and ready for input");
			} else {
				System.out.println("Customer "+customerName.getName()+" already exists");
			}
	} catch (IOException e) {
		System.out.println("An error occured while creating this Customer profile");
		e.printStackTrace();
	}
	
	
		
		//This method writes text into that customer name file I just created	
		
		try {
			FileWriter myWriter = new FileWriter("customerName.txt");
			myWriter.write("This is where we will input the personal information for the Customer\n"
					+ "int customerid\n"
					+ "String username\n"
					+ "String password\n"
					+ "String firstname\n"
					+ "String lastname\n"
					+ "String birthdate\n"
					+ "String streetaddress\n"
					+ "String city\n"
					+ "String state\n"
					+ "int zipcode\n"
					+ "String phone number\n"
					+ "double savingsaccountbalance\n"
					+ "double checkingaccountbalance\n"
					+ "double jointaccountbalance");
			myWriter.close();
			System.out.println("You have successfully created a Customer profile");
		}catch(IOException e) {
			System.out.println("An error has occured while writing to the Customer profile");			
		}
		
	
		
		
		//This method reads the content of the user text file I just wrote in the previous method
				
		
		File customerFile = new File ("C:\\Users\\adesa\\Documents\\workspace-spring-tool-suite-4-4.7.1.RELEASE\\Mojid_JDBC_Console_Banking_Application\\customerName.txt");
		BufferedReader br = new BufferedReader (new FileReader(customerFile));
		String st;
		while ((st = br.readLine()) != null)
			System.out.println(st);
	}
	
}
