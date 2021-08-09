package com.rivwox.payroll;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.IanaLinkRelations;
import org.springframework.hateoas.Link;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@RestController
public class EmployeeController {
	private final EmployeeRepository emplRepo;

	EmployeeController(EmployeeRepository emplRepo) {
		this.emplRepo = emplRepo;
	}

	/*
	 * @GetMapping("/employees") List<Employee> all() { return emplRepo.findAll(); }
	 */

	@GetMapping("/employees")
	ResponseEntity<CollectionModel<EntityModel<Employee>>> findAll() {

		List<EntityModel<Employee>> employees = StreamSupport.stream(emplRepo.findAll().spliterator(), false)
				.map(employee -> EntityModel.of(employee, //
						linkTo(methodOn(EmployeeController.class).findOne(employee.getId())).withSelfRel(), //
						linkTo(methodOn(EmployeeController.class).findAll()).withRel("employees"))) //
				.collect(Collectors.toList());

		return ResponseEntity.ok( //
				CollectionModel.of(employees, //
						linkTo(methodOn(EmployeeController.class).findAll()).withSelfRel()));
	}

	@PostMapping("/employees")
	Employee newEmployee(@RequestBody Employee newEmployee) {
		return emplRepo.save(newEmployee);
	}

	/*
	 * @GetMapping("/employees/{id}") Employee employeeById(@PathVariable Long id) {
	 * return emplRepo.findById(id).orElseThrow(() -> new
	 * EmployeeNotFoundException(id)); }
	 */

	@GetMapping("/employees/{id}")
	ResponseEntity<EntityModel<Employee>> findOne(@PathVariable long id) {

		return emplRepo.findById(id) //
				.map(employee -> EntityModel.of(employee, //
						linkTo(methodOn(EmployeeController.class).findOne(employee.getId())).withSelfRel(), //
						linkTo(methodOn(EmployeeController.class).findAll()).withRel("employees"))) //
				.map(ResponseEntity::ok) //
				.orElse(ResponseEntity.notFound().build());
	}

	@PutMapping("/employees/{id}")
	Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {
		return emplRepo.findById(id).map(employee -> {
			employee.setName(newEmployee.getName());
			employee.setRole(newEmployee.getRole());
			return emplRepo.save(employee);
		}).orElseGet(() -> {
			newEmployee.setId(id);
			return emplRepo.save(newEmployee);
		});
	}

	@DeleteMapping("/employees/{id}")
	void deleteEmployee(@PathVariable Long id) {
		emplRepo.deleteById(id);
	}

}
