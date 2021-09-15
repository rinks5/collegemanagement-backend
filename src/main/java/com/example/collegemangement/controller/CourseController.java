package com.example.collegemangement.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.collegemanagement.model.Courses;
import com.example.collegemanagement.repository.CourseRepository;

@RestController
public class CourseController {
	@Autowired
	private CourseRepository courseRepo;
	
	@GetMapping("getCourse")
	public ResponseEntity<Courses> getCourse(@RequestParam("id") Integer id){
		
		Optional<Courses> course = courseRepo.findById(id);
		
		if(course.isPresent())
			return ResponseEntity.ok().body(course.get());
		else 
			return ResponseEntity.ok().body(null);
		
	}
	
}
