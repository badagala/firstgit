package com.te;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdatingData {

	public static void main(String[] args) {
				try {
					
					Class.forName("com.mysql.jdbc.Driver");
			
					String url = "jdbc:mysql://localhost:3306/my_house?autoReconnect=true&useSSL=false";
					String username = "root";
					String password = "1234";
					Connection con = DriverManager.getConnection(url, username, password);

					String query = "update my_house set traineeCity=? where traineeId=?";

					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

					System.out.println("Please enter the trainee ID");

					int tid = Integer.parseInt(br.readLine());

					int traineeId = tid;

					System.out.println("Please enter the updated city name:");

					String updatedCityName = br.readLine();

					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setInt(2, traineeId);
					pstmt.setString(1, updatedCityName);
					int rowsAffected = pstmt.executeUpdate();
					System.out.println("Number of rows affected : " + rowsAffected);
					
					con.close();

				} catch (Exception e) {
					e.printStackTrace();
				}


	}

}
