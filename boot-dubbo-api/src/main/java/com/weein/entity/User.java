package com.weein.entity;

import java.io.Serializable;
//所有的实体和vo记得序列化
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String city;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
