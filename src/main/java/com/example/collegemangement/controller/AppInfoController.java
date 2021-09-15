package com.example.collegemangement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.collegemanagement.model.StudentAppInfo;
import com.example.collegemanagement.service.AppInfoService;

@RestController
public class AppInfoController {
	
	@Autowired
	private AppInfoService infoService;
	
	@GetMapping("getAllDetails")
	public ResponseEntity<List<StudentAppInfo>> getAllDetails(){
		List<StudentAppInfo> result = infoService.getAllDetails();
		return ResponseEntity.ok().body(result);
	}
	
	@GetMapping("getStudentDetail")
	public ResponseEntity<List<StudentAppInfo>> getStudentDetail(@RequestParam("id") Integer id){
		List<StudentAppInfo> result = new ArrayList<>();
		StudentAppInfo student = infoService.getStudentDetail(id);
		result.add(student);
		return ResponseEntity.ok().body(result);
	}
	
	@PostMapping("saveInfo")
	public ResponseEntity<Boolean> saveInfo(@RequestBody StudentAppInfo student){
		Boolean result = infoService.saveDetail(student);	
		return ResponseEntity.ok().body(result);	
	}
	
	@PutMapping("updateInfo")
	public ResponseEntity<Boolean> updateInfo(@RequestBody StudentAppInfo student){
		Boolean result = infoService.updateDetail(student);	
		return ResponseEntity.ok().body(result);	
	}

}
