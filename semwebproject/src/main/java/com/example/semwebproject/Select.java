package com.example.semwebproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Select {

	public ArrayList<JdbcJava> getAllItems() throws SQLException {

		String sql = "Select * from menu";
		String url = "jdbc:mysql://localhost:3306/project2";
		String username = "GayathriB";
		String password = "Sardhu@123";

		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		ResultSet rst = st.executeQuery(sql);

		// JdbcJava[] a = new JdbcJava[15];
		final ArrayList<JdbcJava> arr = new ArrayList<JdbcJava>();

		while (rst.next()) {

			// System.out.println(rst.getString(1) + " " + rst.getString(2) + " " +
			// rst.getString(3) + " "
			// + rst.getString(4) + " " + rst.getString(5));
			final JdbcJava row1 = new JdbcJava();
			row1.setMenuId(rst.getString(1));
			row1.setCuisine(rst.getString(2));
			row1.setMenuName(rst.getString(3));
			row1.setIngredients(rst.getString(4));
			row1.setMethod(rst.getString(5));
			arr.add(row1);

//			System.out.println(arr.size());
		}
		return arr;
	}
}
