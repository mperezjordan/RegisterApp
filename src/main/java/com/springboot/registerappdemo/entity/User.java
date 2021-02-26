package com.springboot.registerappdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="user")
public class User {
	 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="nickname")
	private String nickName;
	
	public User() {
		
	}
		
    //
	public User(int id, String email, String password, String nickName) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.nickName = nickName;
	}
	//
	public User(String email, String password, String nickName) {
		this.email = email;
		this.password = password;
		this.nickName = nickName;
	}
	//getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	//define to String

	@Override
	public String toString() {
		return "user [id=" + id + ", email=" + email + ", password=" + password + ", nickName=" + nickName + "]";
	}
	
	
	
	
	

}
