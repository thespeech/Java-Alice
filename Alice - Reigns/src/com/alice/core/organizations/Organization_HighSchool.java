package com.alice.core.organizations;


public class Organization_HighSchool extends Organization{
	
	String name="";
	String description="";
	String orgType = "education";
	int ageLow = 16;
	int ageHigh = 18;
	
	
	
	
	public Organization_HighSchool(String name, String desc) {
	this.name = name;
	this.description = desc;
	}

	
}
