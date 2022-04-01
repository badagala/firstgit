package com.te;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnection {

	static Connection con;

	public static Connection getConnection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/my_house?autoReconnect=true&useSSL=false";
			String username = "root";
			String password = "1234";
			con = DriverManager.getConnection(dburl, username, password);
			return con;

		} catch (Exception e) {
			e.printStackTrace();
			return con;

		}

	}

}
