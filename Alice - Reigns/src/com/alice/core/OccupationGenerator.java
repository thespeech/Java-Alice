package com.alice.core;
import java.util.Random;
import com.alice.core.occupations.*;

public class OccupationGenerator {

	//Probabilities should add up to 100% essentially - sums for obvious rand() reasons, in ascending order.
	//First generate organizations categorized by industry. Events will also be roughly categorized as such.
	//Obviously this is not an exhaustive list; there is no interesting stuff to be written for the oil industry, for example. 
	//Each of these is also broken down into their own sub-industries and jobs.
	
	double schoolPercentage = 50;
		double highSchoolPercentage = 60;
		double universityPercentage = 40;
	double policePercentage = 55;
	double officePercentage = 80;
	double mediaPercentage = 85;
	double foodPercentage = 95; 
	double entertainmentPercentage = 100;
	
	Random rand;
	
	public OccupationGenerator() {
		rand = new Random(System.currentTimeMillis());
	}
	
	//99.9% of people are generated using a root person, so that root has influence depending on occupation.
	public void generateRootOccupation(Person rootPerson) {
		//First we deal with the progenitor.
		/*
			int randomNum = rand.nextInt();
		if(randomNum < schoolPercentage) {
			if(rand.nextInt(100) < highSchoolPercentage) {
				Occupation newOccupation = new Occupation_Student("highSchool");
			}
			else {
				Occupation newOccupation = new Occupation_Student("university");
			}
		}
		else if(randomNum < policePercentage) {
			Occupation newOccupation = new Occupation_Police("police");
			}
		else if(randomNum < officePercentage) {
			Occupation newOccupation = new Occupation_Office("office");
		}
		else if(randomNum < mediaPercentage) {
			Occupation newOccupation = new Occupation_Media("media");
		}
		else if(randomNum < foodPercentage) {
			Occupation newOccupation = new Occupation_Food("food");
		}
		else if(randomNum < entertainmentPercentage) {
			Occupation newOccupation = new Occupation_Entertainment("entertainment");
		}
	*/		
		//For now, all are students.
	}
	
	public void generateRelationOccupation(Person rootPerson, Person relatedPerson) {
		//For now, 100% chance of relation being a student.
	}
	
	
}

