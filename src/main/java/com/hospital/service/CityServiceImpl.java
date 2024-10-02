package com.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hospital.entities.City;
import com.hospital.repo.CityRepository;

@Service
public class CityServiceImpl implements CityService{
	
	@Autowired
	private CityRepository crepo;

	@Override
	public List<City> findAllCities() {
		return crepo.findAll();
	}

	@Override
	public List<City> getAllCitybyIds(List<Integer> cIDS) {
		// TODO Auto-generated method stub
		return crepo.findByIdIn(cIDS);
	}

	@Override
	public City findCityById(int id) {
		// TODO Auto-generated method stub
		return crepo.findById(id).get();
	}

}
