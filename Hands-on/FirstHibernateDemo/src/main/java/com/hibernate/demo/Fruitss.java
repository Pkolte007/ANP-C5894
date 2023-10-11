package com.hibernate.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fruitss 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	public Fruitss() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fruitss(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Fruitss [id=" + id + "]";
	}
	
}
