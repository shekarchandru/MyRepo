package com.glearning.emps.controller;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.glearning.emps.model.Employee;
import com.glearning.emps.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping
	public List <Employee> fetchAll() {
		return this.employeeService.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Employee> fetchEmployeeById(@PathVariable("id") long id){
		return this.employeeService.findById(id);
	}
	
	@GetMapping("/name/{name}")
	public Set<Employee> findByNameLike(@PathVariable("name") String name){
		return this.employeeService.findByNameLike(name);
	}

	@GetMapping("/age/{age}")
	public Set<Employee> findByAgeGreaterThanEqual(@PathVariable("age") int age){
		return this.employeeService.findByAgeGreaterThanEqual(age);
	}
	
	@GetMapping("/agebetween/{start}/{end}")
	Set<Employee> findByAgeBetween(@PathVariable("start") int start, @PathVariable("end") int end){
		return this.employeeService.findByAgeBetween(start, end);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Employee save(@RequestBody Employee employee) {
		return this.employeeService.save(employee);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteEmployeeById(@PathVariable("id") long id) {
	    this.employeeService.deleteById(id);
	}

}
