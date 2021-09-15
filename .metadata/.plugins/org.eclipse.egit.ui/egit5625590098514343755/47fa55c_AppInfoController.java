package com.example.collegemangement.controller;

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
	public ResponseEntity<StudentAppInfo> getStudentDetail(@RequestParam("id") Integer id){
		StudentAppInfo student = infoService.getStudentDetail(id);
		return ResponseEntity.ok().body(student);
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
