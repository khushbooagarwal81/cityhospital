package com.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.dto.HospitalWithCity;
import com.hospital.entities.Hospital;
import com.hospital.service.HospitalService;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
	
	@Autowired
	private HospitalService hserv;
	
	
	//@RequestMapping(value="/welcome", method = RequestMethod.GET)
	@GetMapping("/welcome")
	public String getWelcome() {		
		
		return "Khusboo, Welcome to Hospital";
	}
	
	@GetMapping("/allhospital")
	public List<Hospital> getAllHospitals(){
		
		return hserv.findAllHospitals();
		
	}
	
	@GetMapping("/allhospitalwithcity")
	public List<HospitalWithCity> getAllHospitalwithCity(){
		
		return hserv.findAllHospitalwithCity();
		
	}
	
	@GetMapping("/hospitalwithcitybyid/{id}")
	public HospitalWithCity getHospitalwithCityId(@PathVariable("id") int id){
		
		return hserv.findHospitalwithCityById(id);
		
	}
	

}
