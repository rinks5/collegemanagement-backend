package com.example.collegemanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class StudentAppInfo {
	
	@Id
	@GeneratedValue( strategy= GenerationType.IDENTITY ) 
	private int id;
	
	@OneToOne
	private Users user;
	
	@OneToOne
	private Courses course;
	
	private int perTen;
	private int perTwelve;
	private int jeeMarks;
	private String appStatus;
	private String appComment;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Courses getCourse() {
		return course;
	}
	public void setCourse(Courses course) {
		this.course = course;
	}
	public int getPerTen() {
		return perTen;
	}
	public void setPerTen(int perTen) {
		this.perTen = perTen;
	}
	public int getPerTwelve() {
		return perTwelve;
	}
	public void setPerTwelve(int perTwelve) {
		this.perTwelve = perTwelve;
	}
	public int getJeeMarks() {
		return jeeMarks;
	}
	public void setJeeMarks(int jeeMarks) {
		this.jeeMarks = jeeMarks;
	}
	public String getAppStatus() {
		return appStatus;
	}
	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}
	public String getAppComment() {
		return appComment;
	}
	public void setAppComment(String appComment) {
		this.appComment = appComment;
	}

}
