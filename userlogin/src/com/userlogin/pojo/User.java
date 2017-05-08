package com.userlogin.pojo;

import java.sql.Time;

public class User {
	private int id;
	private String name;
	private String password;
	private Time create_date;
	private Time update_date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Time getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Time create_date) {
		this.create_date = create_date;
	}
	public Time getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(Time update_date) {
		this.update_date = update_date;
	}

}
