package com.te;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class UsingStoredProcedure {

	public static void main(String[] args) {
			try {
					
					Class.forName("com.mysql.jdbc.Driver");
					
					String url = "jdbc:mysql://localhost:3306/my_house?autoReconnect=true&useSSL=false";
					String username = "root";
					String password = "1234";
					Connection con = DriverManager.getConnection(url, username, password);

					
					String query = "{call getdetails(?)}";
					Scanner scan = new Scanner(System.in);
					System.out.println("Please enter the name of the student you want to search for:");
					String studentName = scan.nextLine();
					CallableStatement cstc = con.prepareCall(query);
					cstc.setString(1, studentName);
					ResultSet rs = cstc.executeQuery();

					
					while (rs.next()) {
						int tid = rs.getInt(1);
						String name = rs.getString("traineeName");
						int age = rs.getInt(3);
						String city = rs.getString("traineeCity");
						String gender = rs.getString(4);
						System.out.println(tid + " -------- " + name + " -------- " + age + " -------- " + gender + " -------- "
								+ "-------- " + city);

					}
					con.close();

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
	}

