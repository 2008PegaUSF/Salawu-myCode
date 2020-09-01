package com.bank.beans;
import java.io.Serializable;

public class Bank implements Serializable {

	private int customerid;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String birthdate;
	private String streetaddress;
	private String city;
	private String state;
	private int zipcode;
	private String phonenumber;
	private double savingsaccountbalance;
	private double checkingaccountbalance;
	private double jointaccountbalance;
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(int customerid, String username, String password, String firstname, String lastname, String birthdate,
			String streetaddress, String city, String state, int zipcode, String phonenumber,
			double savingsaccountbalance, double checkingaccountbalance, double jointaccountbalance) {
		super();
		this.customerid = customerid;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthdate = birthdate;
		this.streetaddress = streetaddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.phonenumber = phonenumber;
		this.savingsaccountbalance = savingsaccountbalance;
		this.checkingaccountbalance = checkingaccountbalance;
		this.jointaccountbalance = jointaccountbalance;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getStreetaddress() {
		return streetaddress;
	}
	public void setStreetaddress(String streetaddress) {
		this.streetaddress = streetaddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public double getSavingsaccountbalance() {
		return savingsaccountbalance;
	}
	public void setSavingsaccountbalance(double savingsaccountbalance) {
		this.savingsaccountbalance = savingsaccountbalance;
	}
	public double getCheckingaccountbalance() {
		return checkingaccountbalance;
	}
	public void setCheckingaccountbalance(double checkingaccountbalance) {
		this.checkingaccountbalance = checkingaccountbalance;
	}
	public double getJointaccountbalance() {
		return jointaccountbalance;
	}
	public void setJointaccountbalance(double jointaccountbalance) {
		this.jointaccountbalance = jointaccountbalance;
	}
	@Override
	public String toString() {
		return "Bank [customerid=" + customerid + ", username=" + username + ", password=" + password + ", firstname="
				+ firstname + ", lastname=" + lastname + ", birthdate=" + birthdate + ", streetaddress=" + streetaddress
				+ ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + ", phonenumber=" + phonenumber
				+ ", savingsaccountbalance=" + savingsaccountbalance + ", checkingaccountbalance="
				+ checkingaccountbalance + ", jointaccountbalance=" + jointaccountbalance + ", getCustomerid()="
				+ getCustomerid() + ", getUsername()=" + getUsername() + ", getPassword()=" + getPassword()
				+ ", getFirstname()=" + getFirstname() + ", getLastname()=" + getLastname() + ", getBirthdate()="
				+ getBirthdate() + ", getStreetaddress()=" + getStreetaddress() + ", getCity()=" + getCity()
				+ ", getState()=" + getState() + ", getZipcode()=" + getZipcode() + ", getPhonenumber()="
				+ getPhonenumber() + ", getSavingsaccountbalance()=" + getSavingsaccountbalance()
				+ ", getCheckingaccountbalance()=" + getCheckingaccountbalance() + ", getJointaccountbalance()="
				+ getJointaccountbalance() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
