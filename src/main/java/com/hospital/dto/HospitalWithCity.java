package com.hospital.dto;

import com.hospital.entities.City;
import com.hospital.entities.Hospital;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class HospitalWithCity {
	
	private int id;
	private Hospital hospital;
	private City city;

}
