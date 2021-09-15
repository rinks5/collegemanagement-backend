package com.example.collegemanagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.collegemanagement.model.Users;

public interface UserRepository extends JpaRepository<Users,Integer>{
	
	public Optional<Users> findByEmailAndPassword(String email, String password);

}
