import java.util.*;
import java.sql.*;

class Main {

	public static void main(String[] args) {
		// Get Customer Information
		String[] custInfo = Customer.customer_input();
		Customer c1 = new Customer(custInfo[0],custInfo[1],custInfo[2],custInfo[3]);
		// System.out.println("Customer details as below: ");
		// System.out.println(c1.custUuid);
		// System.out.println(c1.custFname);
		// System.out.println(c1.custLname);

		//Database Connection
		String dburl = "jdbc:mysql://192.168.1.10:3306/car_dealership";
		String dbuser = "root";
	    String dbpass = "mysql";

	    try {
	    	Connection con = DriverManager.getConnection(dburl,dbuser,dbpass);
	    	System.out.println("Connection Successful!");
	    	Statement stmt = con.createStatement();
	    	String sql = "insert into `customers` (`uuid`,`fname`,`lname`,`phone`,`email`) values ('"+c1.custUuid+"','"+c1.custFname+"','"+c1.custLname+"','"+c1.custPhone+"','"+c1.custEmail+"')";
	    	System.out.println("SQL Query executed: " + sql);
	    	int rows = stmt.executeUpdate(sql);
	    	System.out.println(rows);
	    	con.close();
	    } catch (SQLException e){
	    	System.out.println(e);	
	    }
	}
}