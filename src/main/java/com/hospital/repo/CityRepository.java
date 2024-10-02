package com.hospital.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hospital.entities.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer>{ //Crudrepo
	
	public List<City> findByIdIn(List<Integer> list);

}
