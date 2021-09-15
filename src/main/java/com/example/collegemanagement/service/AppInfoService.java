package com.example.collegemanagement.service;

import java.util.List;

import com.example.collegemanagement.model.StudentAppInfo;

public interface AppInfoService {
	
	public List<StudentAppInfo> getAllDetails();
	
	public StudentAppInfo getStudentDetail(Integer id);
	
	public Boolean updateDetail(StudentAppInfo student);
	
	public Boolean saveDetail(StudentAppInfo student);

}
