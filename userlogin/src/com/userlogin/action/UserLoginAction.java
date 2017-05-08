package com.userlogin.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.userlogin.pojo.User;
import com.userlogin.service.UserServices;
import com.userlogin.service.UserServicesImpl;

public class UserLoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private User user;
	
	private UserServices userServices;
	@Override
	public String execute() throws Exception {
		userServices = new UserServicesImpl();
		List<User> users = userServices.fingUser(user);
		if(users != null && !users.isEmpty()){
			System.out.println("pwd" + user.getPassword());
			return "success";
		} 
		return "failed";
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
