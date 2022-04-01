package com.te;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcConnectivity {

	public static void main(String[] args) {
		try {
		
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/my_house";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			String query = "create table my_house(traineeId int(20) primary key auto_increment,traineeName varchar(50) not null, traineeAge int(10),traineeGender varchar(10),traineeCity varchar(20)) ";
			Statement stmt = con.createStatement();
			int rowsAffected = stmt.executeUpdate(query);
			System.out.println("Number of rows affected : " + rowsAffected);
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}