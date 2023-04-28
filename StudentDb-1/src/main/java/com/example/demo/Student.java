package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
private int id;
private String sname;
private long phno;
private String email;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}
