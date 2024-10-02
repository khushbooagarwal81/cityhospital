package com.hospital.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.dto.HospitalWithCity;
import com.hospital.entities.City;
import com.hospital.entities.Hospital;
import com.hospital.repo.HospitalRepository;

@Service
public class HospitalServiceImpl implements HospitalService{
	
	@Autowired
	private HospitalRepository hrepo;
	
	@Autowired
	private CityService cserv;
	

	@Override
	public List<Hospital> findAllHospitals() {
		// TODO Auto-generated method stub
		return hrepo.findAll();
	}

	@Override
	public List<HospitalWithCity> findAllHospitalwithCity() {
		
		List<HospitalWithCity> allhospitalwithcity = new ArrayList<>();		
		List<Hospital> allhospitals = hrepo.findAll();	
		List<Integer> CIDS = allhospitals.stream().map(item->item.getCityid()).collect(Collectors.toList());		
		List<City> allcities = cserv.getAllCitybyIds(CIDS);	
		
		allhospitals.stream().forEach(hospital->{
			allcities.stream().forEach(city->{				
				if(hospital.getCityid() == city.getId()) {
					allhospitalwithcity.add(new HospitalWithCity(hospital.getId(),hospital,city));
				}				
			});
		});
		
		return allhospitalwithcity;
	}

	@Override
	public HospitalWithCity findHospitalwithCityById(int id) {
		
		Hospital hospital = hrepo.findById(id).get();		
		City city = cserv.findCityById(hospital.getCityid());
		return new HospitalWithCity(hospital.getId(),hospital,city);
	}

	

}
