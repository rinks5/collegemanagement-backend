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
	
	private int user;
	private String course;
	private int perTen;
	private int perTwelve;
	private int jeeMarks;
	private String appStatus;
	private String appComment;
	private String userName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser() {
		return user;
	}
	public void setUser(int user) {
		this.user = user;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
