package com.te;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnection {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/my_data_base";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			con.close();
			if (con.isClosed()) {
				System.out.println("Connection is closed");
			} else {
				System.out.println("Conncetion is active");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
