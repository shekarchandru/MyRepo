package com.greatlearning.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.library.model.GreatLearning;

//@Controller
@RestController
public class ExampleController {
	@GetMapping("/info")
	// @ResponseBody
	public GreatLearning get() {
		GreatLearning gl = new GreatLearning();
		gl.setCourseName("Learn Controllers in Spring Boot");
		gl.setCourseType("Spring Framework");
		gl.setInstructorName("Samarth Narula");
		return gl;
	}

	@PostMapping("/customInfo")
	public GreatLearning customInfo(String courseName, String courseType, String instructorName) {
		GreatLearning gl = new GreatLearning();
		gl.setCourseName(courseName);
		gl.setCourseType(courseType);
		gl.setInstructorName(instructorName);
		return gl;
	}

}
