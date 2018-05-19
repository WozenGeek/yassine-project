package com.yacine.project.DAO;
import java.awt.List;
import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import com.yacine.project.entities.Customer;

public class CustomerDAO {
	/*
	public Customer add(Customer c) {
		Connection con=null;
		PreparedStatement pstmt=null;
		String query="insert into Customer values(?,?,?,?)";
		try {
		//using connect method which has the connection obj ;
			connect();
			
			pstmt=con.prepareStatement(query);
			pstmt.setInt(0,c.getCustomerID());
			pstmt.setString(1,c.getCustomerName());
			pstmt.setString(2,c.getAdress());
			pstmt.setString(4,c.getPhone());
			pstmt.executeUpdate();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Somethong is definetly wrong ");
		}
		
		//closing the connection obj:
		con.close();
		
		return c;	
	}
	
	public List<Customer> getAll(){
		List<Customer> customers=new ArrayList<Customer>();
		Connection con=null;
		Statement stmt=null;
		ResultSet result=null;
		String query="Select * From Customer";
		
		connect();
		stmt=(Statement) con.createStatement();
		result=((java.sql.Statement) stmt).executeQuery(query);
		while(result.next()) {
			customers.add(new Customer(result.getInt(0),result.getString(1),result.getString(2),result.getString(3)));
		}
		
		con.close();
	}
	
	public Customer getById(int id) {
		Customer customer=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet result;
		String query="Select * From Customer Where id=?";
		
		connect();
		
		pstmt=con.prepareStatement(query);
		result=pstmt.executeQuery();
		result.next();
		customer=new Customer(result.getInt(0),result.getString(1),result.getString(2),result.getString(3));
		
		con.close();
		
	}

*/

}
