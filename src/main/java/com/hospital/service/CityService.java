package com.hospital.service;

import java.util.List;

import com.hospital.entities.City;

public interface CityService {

	List<City> findAllCities();

	List<City> getAllCitybyIds(List<Integer> cIDS);

	City findCityById(int id);

}
