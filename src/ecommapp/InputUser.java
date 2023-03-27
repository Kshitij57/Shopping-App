package ecommapp;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class InputUser {

	public static boolean InsertUser(registeruser Registeruser) {
		
		boolean f = false;
		

		try {
			// insert into DB
			// Create Connection
			checkconnection Checkconnection = new checkconnection();
			Connection con = Checkconnection.getConnection();
			// SQL Querry
			String s = "insert into user(name,Username,Password) values(?,?,?)";
			// Prepared Statement
			PreparedStatement preparedStatement = con.prepareStatement(s);
			// set values of parameter
			preparedStatement.setString(1, Registeruser.getname());
			preparedStatement.setString(2, Registeruser.getUsername());
			preparedStatement.setString(3, Registeruser.getPassword());
			// execute
			preparedStatement.executeUpdate();
			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
		
	}
	
}
