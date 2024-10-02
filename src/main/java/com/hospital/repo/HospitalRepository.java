package com.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.entities.Hospital;

@Repository
public interface HospitalRepository  extends JpaRepository<Hospital, Integer>{

}
