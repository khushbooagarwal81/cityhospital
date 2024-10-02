package com.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.relationentities.Teacher;
import com.hospital.repo.TeacherRepo;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	private TeacherRepo trepo;
	
	@GetMapping("/all")
	public List<Teacher> getAllTeachers(){
		return trepo.findAll();
	}
}
