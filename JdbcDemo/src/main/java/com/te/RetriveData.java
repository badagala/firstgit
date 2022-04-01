package com.te;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class RetriveData {

	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306/my_house";
			String name ="root";
			String password ="1234";
			Connection connection = DriverManager.getConnection(url, name, password);
			String query = "select*FROM my_house where traineeGender=?";
			PreparedStatement preparedstatement =(PreparedStatement) connection.prepareStatement(query);
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter the trainee gender");
			String string = scanner.next();
			preparedstatement.setString(1, string);
			ResultSet rs = preparedstatement.executeQuery();
			
			while(rs.next()) {
				int empId = rs.getInt("traineeId");
				String traineeName = rs.getString("traineename");
				String traineeCity = rs.getString("trianeecity");
				String traineeGender = rs.getString("traineegender");
				int age = rs.getInt("traineeage");
				
				System.out.println("empId is "+empId+"of"+traineeName+"from"+traineeCity+"of "+traineeGender+"age"+age);
			}
			connection.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

			

