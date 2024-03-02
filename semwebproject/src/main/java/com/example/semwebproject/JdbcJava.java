package com.example.semwebproject;

public class JdbcJava {
	String menuId = "";
	String cuisine = "";
	String menuName = "";
	String ingredients = "";
	String method = "";

	/*
	 * public JdbcJava(String menuId, String cuisine, String menuName, String
	 * ingredients, String method) { super(); this.menuId = menuId; this.cuisine =
	 * cuisine; this.menuName = menuName; this.ingredients = ingredients;
	 * this.method = method; }
	 */

	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

}
