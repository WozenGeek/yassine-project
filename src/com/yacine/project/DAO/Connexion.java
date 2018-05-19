package com.yacine.project.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connexion {
	static Connection con;
	public static Connection connect() {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:/mysql/localhost/orderProcessingManagement", "root", "");
		}catch(Exception ex) {
			
		}
		return null;
	}

}
