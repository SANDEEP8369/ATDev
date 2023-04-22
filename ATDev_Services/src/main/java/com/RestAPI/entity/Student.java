package com.RestAPI.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity     
@Table(name = "student") //Database table name
public class Student {
	
	@Id  // Primary key
	@GeneratedValue(strategy = GenerationType.AUTO) // for Auto_Increment
	@Column(name = "student_id")
	private int id;
	
	@Column(name = "First_name")
	private String firstname;
	
	@Column(name = "Last_name")
	private String lastname;
	
	@Column(name = "Rollno")
	private int rollno;
	
	private String city;
	
	
	// instead of getter setter or constructor we can use @lombok annotation
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Student(int id, String firstname, String lastname, int rollno, String city) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.rollno = rollno;
		this.city = city;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", rollno=" + rollno
				+ ", city=" + city + "]";
	}
	
	
	

}
