package ecommapp;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.shoping.ConnectionTest;

public class OderDetails {
	public void previousOrderHistory() throws ClassNotFoundException, SQLException {
		System.out.println("Previous Order History of User : ");
		System.out.println("----------------------------------");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter UserName : ");
		String Username = scan.next();
		//create connection
		checkconnection Checkconnection = new checkconnection();
		Connection con = Checkconnection.getConnection();
	}
}
