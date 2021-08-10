package com.rivwox.unittestEx;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@PostMapping
	public PatientModel createRecord(@RequestBody @Valid PatientModel patient) {
		return repo.save(patient);
	}

	/*
	 * @PutMapping public PatientModel updatePatientRecord(@RequestBody PatientModel
	 * patient) throws NotFoundException { if (patient == null || patient.getYear()
	 * == null) { throw new
	 * InvalidRequestException("PatientRecord or ID must not be null!"); }
	 * Optional<PatientModel> optionalRecord = repo.findById(patient.getYear()); if
	 * (optionalRecord.isEmpty()) { throw new NotFoundException(); } PatientModel
	 * existingPatientRecord = optionalRecord.get();
	 * 
	 * existingPatientRecord.setSong(patient.getSong());
	 * existingPatientRecord.setArtist(patient.getArtist());
	 * existingPatientRecord.setWinner_country(patient.getWinner_country());
	 * 
	 * return repo.save(existingPatientRecord); }
	 */

	@DeleteMapping(value = "{patientID}")
	public void deletePatientById(@PathVariable(value = "patient_id") Long patientId) throws NotFoundException {
		if (repo.findById(patientId).isEmpty()) {
			throw new NotFoundException();
		}
		repo.deleteById(patientId);
	}

}
