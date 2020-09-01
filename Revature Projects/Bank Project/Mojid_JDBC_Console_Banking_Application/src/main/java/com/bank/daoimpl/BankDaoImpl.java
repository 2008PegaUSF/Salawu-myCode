package com.bank.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bank.beans.Bank;
import com.bank.util.ConnFactory;


public class BankDaoImpl {

	public static ConnFactory cf= ConnFactory.getInstance();
	
	public List<Bank> getAllCustomer() throws SQLException {
		List<Bank> customerList=new ArrayList<Bank>();
		Connection conn= cf.getConnection();
		Statement stmt= conn.createStatement();
		ResultSet rs=stmt.executeQuery("select * from \"Customer\"");
		Bank a=null;
		while(rs.next()) {
			a= new Bank(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),
					rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10),
					rs.getString(11),rs.getDouble(12),rs.getDouble(13),rs.getDouble(14));
			customerList.add(a);
		}
		return customerList;
	}

	public List<Bank> getAllCustomerByCustomerId(int id) throws SQLException {
		List<Bank> customerList=new ArrayList<Bank>();
		Connection conn= cf.getConnection();
		String sql= "select * from \"Customer\" where \"customerid\"= ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		Bank a=null;
		while(rs.next()) {
			a= new Bank(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),
					rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10),
					rs.getString(11),rs.getDouble(12),rs.getDouble(13),rs.getDouble(14));
			customerList.add(a);
		}
		return customerList;
	}


}
