package Lecture31;

import java.sql.*;

public class JDBC_Demo {
	public static void main(String[] args) {

// Step 1 :- Load driver class

//		String driverClassName = "sun.jdbc.odbc.JdbcOdbcDriver";
//		Class.forName(driverClassName);

		try {

// Step 2 :- Obtain a connection
			String url = "jdbc:mysql://localhost:3306/hellodb";
			String username = "root";
			String password = "Sohil7900@";

			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Successfully");

// Step 3 :- Obtain a statement
			Statement st = con.createStatement();

// Step 4 :- Execute the query

//			String [/} = "create table students (rollno int(4), name varchar(20))";
//		    st.execute(query1);
//			System.out.println("Table Created Successfully");

			String query2 = "insert into students values(1, 'Abc')";
			int count = st.executeUpdate(query2);
			System.out.println("Number of rows affected= " + count);

// Step 5 :- Closing the connection as per the
			con.close();

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

}
