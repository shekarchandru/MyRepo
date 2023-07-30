package com.gl.lib.libsubhasish1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gl.lib.libsubhasish1.model.GreatLearning;



@RestController
@RequestMapping("/hello")
public class MyController {

	
	@GetMapping("/greet")
	public String sayHello()
	{
		System.out.println("Say Hello");
		return "Hello! Good Morning";
	}
	
	@GetMapping("/info")
	public GreatLearning getData()
	{
		GreatLearning greatLearning = new GreatLearning();
		greatLearning.setCourseName("Learn Controller is spring boot");
		greatLearning.setCourseType("Information Technology");
		greatLearning.setInstructorName("Roy");
		return greatLearning;
	}
	
	@PostMapping("customInfo")
	public GreatLearning customInfo(String courseName, String courseType, String instructorName)
	{
		GreatLearning greatLearning = new GreatLearning();
		greatLearning.setCourseName(courseName);
		greatLearning.setCourseType(courseType);
		greatLearning.setInstructorName(instructorName);
		return greatLearning;
	}
	
	/*@PostMapping("/customInfo")
	public GreatLearning customInfo(String courseName, String courseType, String instructorName)
	{
		GreatLearning greatLearning =new GreatLearning();
		greatLearning.setCourseName(courseName);
		greatLearning.setCourseType(courseType);
		greatLearning.setInstructorName(instructorName);
		System.out.println(greatLearning);
		return greatLearning;
	}*/
	
	
}
