package com.rajashis.pojo;

public class HumanID {

	private String name;
	private int age;
	private String gender;
	private String address;
	private String occupation;
	private String humanity;
	
	
	
	public HumanID() {
		super();
	}


	public HumanID(String name, int age, String gender, String address, String occupation, String humanity) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.occupation = occupation;
		this.humanity = humanity;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getHumanity() {
		return humanity;
	}
	public void setHumanity(String humanity) {
		this.humanity = humanity;
	}
	
	
	

}
