package com.bank.driver;
import java.sql.SQLException;

import com.bank.daoimpl.BankDaoImpl;

public class Driver {

	public static void main(String[] args) {
		BankDaoImpl adi= new BankDaoImpl();
		
		try {
			System.out.println(adi.getAllCustomerByCustomerId(01));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
