package com.example.collegemanagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.collegemanagement.model.StudentAppInfo;

public interface AppInfoRepository extends JpaRepository<StudentAppInfo, Integer> {
	
	public Optional<StudentAppInfo> findByUser(Integer id);

}
