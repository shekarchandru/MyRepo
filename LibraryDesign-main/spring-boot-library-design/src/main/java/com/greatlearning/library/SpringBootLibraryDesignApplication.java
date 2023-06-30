package com.greatlearning.library;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.greatlearning.library.model.GreatLearning;

@SpringBootApplication
public class SpringBootLibraryDesignApplication implements CommandLineRunner 
{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibraryDesignApplication.class, args);
		System.out.println("Hello Spring Boot with DevTools");
	}

	
	
	  @Override public void run(String... args) throws Exception { GreatLearning
	  gl=new GreatLearning();
	  gl.setCourseName("Desingning MicroServices with SpringBOOT");
	  gl.setCourseType("Information Technology");
	  gl.setInstructorName("Samarth Narula");
	  System.out.println("GreatLearning: "+gl);
	  
	  GreatLearning glCreationalDesign=new
	  GreatLearning("Learn Creational Design Patterns","IT");
	  System.out.println("GreatLearning with Creational(Telescopic) Design: "
	  +glCreationalDesign);
	  
	  
	  }
	 
	 

}
