package com.jnit;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.*;

@Entity
@Table(name="students")

public class students {

   public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Date getDate_of_birth() {
		return date_of_birth;
		
	}
	public void setDate_of_birth( Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
@Id
   @Column(name="student_id")
   private int student_id;
   @Column(name="first_name")
   private String first_name;
   @Column(name="last_name")
   private String last_name;
   @Column(name="date_of_birth")
   private Date date_of_birth;
   @Column(name="email")
   private String email;
   
   
   
}
