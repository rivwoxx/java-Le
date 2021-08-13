package com.rivwox.unittestEx;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javassist.NotFoundException;

@RestController
@RequestMapping(value = "/")
public class PatientController {
	@Autowired
	PatientRecordRepository repo;

	@GetMapping(value = "patients")
	public List<PatientModel> getAllRecords() {
		return repo.findAll();
	}

	@GetMapping(value = "patient") 
	public PatientModel getPatientById(@RequestParam Long id){
		return repo.findById(id).get();
	}

	@PostMapping(value = "addpatient")
	public PatientModel createRecord(@RequestBody @Valid PatientModel patient) {
		return repo.save(patient);
	}

	@PutMapping(value = "modpatient")
	public PatientModel updatePatientRecord(@RequestBody PatientModel patient) throws NotFoundException {
		if (patient == null || patient.getId() == null) {
			throw new InvalidRequestException("PatientRecord or ID must not be null!");
		}
		Optional<PatientModel> optionalRecord = repo.findById(patient.getId());
		if (optionalRecord.isEmpty()) {
			throw new NotFoundException("Patient with ID " + patient.getId() + " does not exist.");
		}
		PatientModel existingPatientRecord = optionalRecord.get();

		existingPatientRecord.setName(patient.getName());
		existingPatientRecord.setAge(patient.getAge());
		existingPatientRecord.setIllness(patient.getIllness());

		return repo.save(existingPatientRecord);
	}

	@DeleteMapping(value = "deletepatient")
	public void deletePatientById(@RequestParam Long id) throws NotFoundException {
//		if (repo.findById(id).isEmpty().) {
//			throw new NotFoundException("Patient with ID " + id + " does not exist.");
//		}
		repo.findById(id).orElseThrow(() -> new NotFoundException("Patient with ID " + id + " does not exist."));
		
		repo.deleteById(id);
		
	}

}
