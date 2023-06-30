package com.greatlearning.library.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GreatLearning {
	
	private String courseName;
	private String courseType;
	private String instructorName;
	
	public GreatLearning(String courseName,String courseType)
	{
		this.courseName=courseName;
		this.courseType=courseType;
	}
	

}
