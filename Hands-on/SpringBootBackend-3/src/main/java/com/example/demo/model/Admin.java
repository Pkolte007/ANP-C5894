package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="admin_007")
public class Admin
{
 @Id
 private int id;
 @Column
 private String username;
 @Column
 private String password;
public Admin() {
	super();
	// TODO Auto-generated constructor stub
}
public Admin(int id, String username, String password) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
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
 
 
}