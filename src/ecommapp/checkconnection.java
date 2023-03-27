package ecommapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException ;
public class checkconnection {

	public Connection getConnection() throws SQLException, ClassNotFoundException {
		// load driver
	
			Class.forName("com.mysql.jdbc.Driver");
			 
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommapp","root","Kshitij@123");
		
		return connection;
		
}
}