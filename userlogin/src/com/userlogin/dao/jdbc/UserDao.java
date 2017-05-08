package com.userlogin.dao.jdbc;

import java.util.List;

import com.userlogin.pojo.User;

public interface UserDao {
	
	public List<User> fingUser(User user);

}
