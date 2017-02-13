package com.model;

public class User {

	private String userName;
	private String password;
	private Integer age;
	private String sex;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public User() {
		this.userName = "";
		this.password = "";
		this.age = 0;
		this.sex = "";
	}
	
	
	
}
