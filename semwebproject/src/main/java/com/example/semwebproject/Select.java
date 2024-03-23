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

		ResultSet rst = getResultSet();

		// JdbcJava[] a = new JdbcJava[15];
		final ArrayList<JdbcJava> arr = new ArrayList<>();

		while (rst.next()) {
			final JdbcJava row1 = new JdbcJava();
			row1.setMenuId(rst.getString(1));
			row1.setCuisine(rst.getString(2));
			row1.setMenuName(rst.getString(3));
			row1.setIngredients(rst.getString(4));
			row1.setMethod(rst.getString(5));
			arr.add(row1);
		}
		return arr;
	}

	protected ResultSet getResultSet() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project2",
				"GayathriB", "Sardhu@123");
		Statement st = con.createStatement();
		ResultSet rst = st.executeQuery("Select * from menu");
		return rst;
	}
}
