package com.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.relationentities.Teacher;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Integer>{
	
	

}
