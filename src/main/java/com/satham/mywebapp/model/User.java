package com.satham.mywebapp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="STUDENT")
public class User {
	@Id
	private int id;
	private String name;
	public String toString()
	{
		return "Student Name is "+name+" And Id is "+id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
