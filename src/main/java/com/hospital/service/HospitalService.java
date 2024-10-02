package com.hospital.service;

import java.util.List;

import com.hospital.dto.HospitalWithCity;
import com.hospital.entities.Hospital;

public interface HospitalService {

	List<Hospital> findAllHospitals();

	List<HospitalWithCity> findAllHospitalwithCity();

	HospitalWithCity findHospitalwithCityById(int id);

}
