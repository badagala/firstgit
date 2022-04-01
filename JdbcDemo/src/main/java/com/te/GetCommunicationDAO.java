package com.te;

import java.sql.Connection;

import com.mysql.jdbc.PreparedStatement;

public class GetCommunicationDAO {

	static Connection con = GetConnection.getConnection();

	public static Boolean inserQuery(SuperHeros hero) {
		String query = "insert into superheros values(?,?,?,?)";
		boolean a = false;
		try {
			PreparedStatement ptmt = (PreparedStatement) con.prepareStatement(query);
			ptmt.setInt(1, hero.getId());
			ptmt.setString(2, hero.getName());
			ptmt.setString(3, hero.getPower());
			ptmt.setString(4, hero.getWeapon());
			int rows = ptmt.executeUpdate();
			if (rows > 0) {
				a = true;
				System.out.println(rows + "are inserted");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (a == true) {
			return a;

		}
		return a;

	}
}
