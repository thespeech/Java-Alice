package com.alice.core;
import java.util.Random;

public class OrganizationGenerator {

	//Probabilities should add up to 100%.
	//First generate organizations categorized by industry. Events will also be roughly categorized as such.
	//Obviously this is not an exhaustive list; there is no interesting stuff to be written for the oil industry, for example. 
	//Each of these is also broken down into their own sub-industries and jobs.
	//These probabilities only describe the chance of someone being in one of these. The specifics of the organization are not important
	//such as class, etc.
	
	double schoolPercentage = 50;
	double policePercentage = 5;
	double officePercentage = 25;
	double mediaPercentage = 5;
	double foodPercentage = 10; 
	double entertainmentPercentage = 5;
	
	
	Random rand;
	
	public OrganizationGenerator() {
		rand = new Random(System.currentTimeMillis());
	}
	
}
