package com.alok.restfullwebservices.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
	
	private int id;
	
	@Size(min = 2)
	private String Name;
	
	@Past
	private Date DOB;
	
	public User(int id, String name, Date dOB) {
		this.id = id;
		Name = name;
		DOB = dOB;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", Name=" + Name + ", DOB=" + DOB + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getDOB()=" + getDOB() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	

}
