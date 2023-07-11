package com.glearning.emps.service;

import java.util.Optional;
import java.util.Set;

import com.glearning.emps.model.Employee;

public interface EmployeeService {
	
	Employee save(Employee employee);
	
	Set<Employee> fetchAll();
	
	
	
	void deleteById(long id);
	public Optional<Employee> findById(long id); 
	
	Set<Employee> fetchEmployeesByName(String name);
	
	Set<Employee> fetchEmpByAgeGt(int age);

}
