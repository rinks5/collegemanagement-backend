package com.example.collegemangement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.collegemanagement.model.Users;
import com.example.collegemanagement.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("addUser") 
	public ResponseEntity<Boolean> addUser(@RequestBody Users user){
		
		Boolean result = userService.saveUser(user);
		
		return ResponseEntity.ok().body(result);
		
	}
	
	@GetMapping("getUser")
	public ResponseEntity<Users> getUser(@RequestParam("email") String email, @RequestParam("password") String password){
		
		Users user = userService.findUser(email,password);
		
		return ResponseEntity.ok().body(user);
		
	}

			
}
