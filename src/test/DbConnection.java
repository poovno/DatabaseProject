package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class DbConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","root");
	
	Statement stmt = con.createStatement();
	ResultSet result = stmt.executeQuery("Select * from eproduct");
	
	while (result.next()) {
		System.out.println("Product Id " + result.getInt("ID"));
	System.out.println("Product name " + result.getString("name"));
	System.out.println("Product Price " + result.getString("Price"));
	
	}
	con.close();
	}

}
