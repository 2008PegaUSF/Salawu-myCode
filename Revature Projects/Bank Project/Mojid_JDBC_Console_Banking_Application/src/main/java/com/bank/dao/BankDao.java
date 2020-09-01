package com.bank.dao;

import java.sql.SQLException;
import java.util.List;

import com.bank.customer.Customer;

public interface BankDao {

	public List<Customer> getAllCustomer() throws SQLException;
	public List<Customer> getAllCustomerByCustomerId(int id) throws SQLException;
}
