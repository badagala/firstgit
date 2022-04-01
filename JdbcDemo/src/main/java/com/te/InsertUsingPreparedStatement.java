package com.te;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class InsertUsingPreparedStatement {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");	
			String dburl = "jdbc:mysql://localhost:3306/my_house?autoReconnect=true&useSSL=false";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(dburl, username, password);
			String query = "insert into my_house(traineeName,traineeAge,traineeGender,traineeCity) values(?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, "Girish");
			pstmt.setInt(2, 23);
			pstmt.setString(3, "Male");
			pstmt.setNString(4, "AndhraPradesh");
			int rowsAffected = pstmt.executeUpdate();
			System.out.println("Number of rows affected : " + rowsAffected);
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


	
