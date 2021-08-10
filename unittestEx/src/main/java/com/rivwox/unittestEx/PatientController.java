package com.rivwox.unittestEx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/patient")
public class PatientController {
	@Autowired
	PatientRecordRepository repo;

	@GetMapping
	public List<PatientModel> getAllRecords() {
		return repo.findAll();
	}

	@GetMapping
	public PatientModel getPatientById(@PathVariable(value = "id") Long id) {
		return repo.findById(id).get();
	}
}
