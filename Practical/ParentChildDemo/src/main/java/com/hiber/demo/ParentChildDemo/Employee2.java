package com.hiber.demo.ParentChildDemo;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Employee2 
{
  @Id
   private int eId;
   
   private String eName;
   @ManyToOne
   //@JoinColumn(name = "department_id")
   private Department department;

public int geteId() {
	return eId;
}

public void seteId(int eId) {
	this.eId = eId;
}

public String getEname() {
	return eName;
}

public void setEname(String eName) {
	this.eName = eName;
}

public Department getDepartment() {
	return department;
}

public void setDepartment(Department department) {
	this.department = department;
}
   
   
}
