package com.zensar.controller.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.entity.Student;

public interface StundentRepository extends JpaRepository<Student, Integer>{
	
}
