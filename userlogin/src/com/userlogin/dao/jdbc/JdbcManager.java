package com.userlogin.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.userlogin.utils.PropertiesManager;

public class JdbcManager {
	private static String driver;
	private static String username;
	private static String password;
	private static String url;
	
	
	public static Connection getConnection() {
		Connection connection = null;
		Properties properties = PropertiesManager.getProperties("com/userlogin/utils/jdbc.properties");
		driver = properties.getProperty("driver");
		username = properties.getProperty("username");
		password = properties.getProperty("password");
		url = properties.getProperty("url");
		try {
			try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(getConnection());
	}

}
