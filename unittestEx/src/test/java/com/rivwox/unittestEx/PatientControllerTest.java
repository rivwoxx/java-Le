package com.rivwox.unittestEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMultipartHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

@WebMvcTest(PatientController.class)
public class PatientControllerTest {

	@Autowired
	MockMvc mockMvc;
	@Autowired
	ObjectMapper mapper;

	@MockBean
	PatientRecordRepository patientRecordRepository;

	PatientModel RECORD_1 = new PatientModel(2l, "Rayven Yor", 23l, "Coronavirus");
	PatientModel RECORD_2 = new PatientModel(3l, "David Landup", 27l, "Flu");
	PatientModel RECORD_3 = new PatientModel(4l, "Jane Doe", 31l, "Unknown");
	
	@Test
	public void getAllRecords_success() throws Exception {
	    List<PatientModel> records = new ArrayList<>(Arrays.asList(RECORD_1, RECORD_2, RECORD_3));
	    
	    Mockito.when(patientRecordRepository.findAll()).thenReturn(records);
	    
	    mockMvc.perform(MockMvcRequestBuilders
	            .get("/patients")
	            .contentType(MediaType.APPLICATION_JSON))
	            .andExpect(status().isOk())
	            .andExpect(jsonPath("$", hasSize(3)))
	            .andExpect(jsonPath("$[2].name", is("Jane Doe")));
	}
	
	
	/*
	 * @Test public void getPatientById_success() throws Exception {
	 * Mockito.when(patientRecordRepository.findById(RECORD_1.getId())).thenReturn(
	 * java.util.Optional.of(RECORD_1));
	 * 
	 * mockMvc.perform(MockMvcRequestBuilders .get("/patient?id=1")
	 * .contentType(MediaType.APPLICATION_JSON)) .andExpect(status().isOk())
	 * .andExpect(jsonPath("$", notNullValue())) .andExpect(jsonPath("$.name",
	 * is("Rayven Yor"))); }
	 */
	
	  @Test public void createRecord_success() throws Exception { PatientModel
	  record = PatientModel.builder() 
	  .name("John Doe") 
	  .age(47L)
	  .illness("Unknown") 
	  .build();
	  
	  Mockito.when(patientRecordRepository.save(record)).thenReturn(record);
	  
	  MockHttpServletRequestBuilder mockRequest =
	  MockMvcRequestBuilders.post("/addpatient")
	  .contentType(MediaType.APPLICATION_JSON) .accept(MediaType.APPLICATION_JSON)
	  .content(this.mapper.writeValueAsString(record));
	  
	  mockMvc.perform(mockRequest) .andExpect(status().isOk())
	  .andExpect(jsonPath("$", notNullValue())) .andExpect(jsonPath("$.name",
	  is("John Doe"))); }
	 
}
