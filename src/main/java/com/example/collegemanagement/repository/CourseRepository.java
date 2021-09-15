package com.example.collegemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.collegemanagement.model.Courses;

public interface CourseRepository extends JpaRepository<Courses, Integer> {

}
