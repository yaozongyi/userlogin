package com.userlogin.dao.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.userlogin.pojo.User;

public class UserDaoImpl implements UserDao {

	@Override
	public List<User> fingUser(User user) {
		
		List<User> userList = null;
		
		String findUserWithName = "select t.id,t.name,t.password,t.create_date,t.update_date from t_user t where t.name = ? ";
		
		java.sql.Connection connection = null;
		PreparedStatement prep = null;
		ResultSet resultSet = null;
		try {
			connection = JdbcManager.getConnection();
			prep = connection.prepareStatement(findUserWithName);
			prep.setString(1, user.getName());
			resultSet = prep.executeQuery();
			while (resultSet.next()) {
				User findedUser = new User();
				findedUser.setId(resultSet.getInt(1));
				findedUser.setName(resultSet.getString(2));
				findedUser.setPassword(resultSet.getString(3));
				userList = new ArrayList<User>();
				userList.add(findedUser);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				resultSet.close();
				prep.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return userList;
	}

	
	public static void main(String[] args) {
		User user = new User();
		user.setName("yao");
		
		UserDaoImpl impl = new UserDaoImpl();
		List<User> users = impl.fingUser(user);
		System.out.println(users.isEmpty());
	}
}
