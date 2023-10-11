package com.hibernate.demo;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cars {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private long id;

private String name;
private String degree;
private String roll;
private String phone;

 
public Cars() {
	super();
	// TODO Auto-generated constructor stub
}

public Cars(long id, String name, String degree, String roll, String phone) {
	super();
	this.id = id;
	this.name = name;
	this.degree = degree;
	this.roll = roll;
	this.phone = phone;
}

public long getId() {
return id;
}
public void setId(long id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getDegree() {
return degree;
}
public void setDegree(String degree) {
this.degree = degree;
}
public String getRoll() {
return roll;
}
public void setRoll(String roll) {
this.roll = roll;
}
public String getPhone() {
return phone;
}
public void setPhone(String phone) {
this.phone = phone;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", degree=" + degree + ", roll=" + roll + ", phone=" + phone + "]";
}

}