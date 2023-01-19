package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Javaa {
	
	
	//precondition
	
	static String dbconnectivityname = "com.mysql.cj.jdbc.Driver"; // called the connector
	static String dbconnectivityaddress = "jdbc:mysql://localhost:3306/finaldb2"; // called the connector
	static String systemdbusername = "root"; // db username
	static String systemdbpassword = "25111993"; // db passsword
	static String excutesql_query = "SELECT * FROM finaldb2.finalbatch555;"; // sql query

	
	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	
	{
		Class.forName(dbconnectivityname);
		
		Connection createconnection = DriverManager.getConnection(dbconnectivityaddress, systemdbusername, systemdbpassword);
		Statement createcommand = createconnection.createStatement();
		ResultSet storeresult =createcommand.executeQuery(excutesql_query);
	
		
		while(storeresult.next())
		{
			System.out.println("different rows and columns data");
			String displayname = storeresult.getString(1);
			String age = storeresult.getString(2);
			String address = storeresult.getString(3);
			int mobile_number = storeresult.getInt(4);
			System.out.println(displayname + "  " + age + "  "+ address +  "  "+ mobile_number);

		}
		
	}
		
		
	
			

	

}
