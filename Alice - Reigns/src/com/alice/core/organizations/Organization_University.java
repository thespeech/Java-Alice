package com.alice.core.organizations;

public class Organization_University extends Organization{
	
	String name="";
	String description="";
	String orgType = "education";
	int ageLow = 18;
	int ageHigh = 22;
	
	public Organization_University(String name, String desc) {
	this.name = name;
	this.description = desc;
	}

}
