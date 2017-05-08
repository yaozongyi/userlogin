package com.userlogin.service;

import java.util.List;

import com.userlogin.dao.jdbc.UserDao;
import com.userlogin.dao.jdbc.UserDaoImpl;
import com.userlogin.pojo.User;

public class UserServicesImpl implements UserServices {

	private UserDao userDao;
	@Override
	public List<User> fingUser(User user) {
		userDao = new UserDaoImpl();
		List<User> users = userDao.fingUser(user);
		return users;
	}

}
