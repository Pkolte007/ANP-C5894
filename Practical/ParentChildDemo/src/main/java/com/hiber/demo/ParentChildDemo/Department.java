package com.hiber.demo.ParentChildDemo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class Department 
{

	@Id
	@Column(name = "department_id")
	private int dId;
	@Column
	private String dName;
	@OneToMany
	private Set<Employee2> employee;
	

	public int getdId() {
		return dId;
	}


	public void setdId(int dId) {
		this.dId = dId;
	}


	public String getdName() {
		return dName;
	}


	public void setdName(String dName) {
		this.dName = dName;
	}


	public Set<Employee2> getEmployee() {
		return employee;
	}


	public void setEmployee(Set<Employee2> employee) {
		this.employee = employee;
	}


	@Override
	public String toString() {
		return "Department [dId=" + dId + ", dName=" + dName + ", employee=" + employee + "]";
	}


	
	
	
}
