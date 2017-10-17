package com.alice.core;
import java.util.*;

public class PeopleManager {
	PeopleGenerator mainGenerator;
	List<Person> castList;
	
	public void createPeople(int numOfPersons, int classSize) {
		System.out.println("Creating people.");
		mainGenerator = new PeopleGenerator();
		castList = mainGenerator.createCastList(numOfPersons);
		createClasses(numOfPersons, classSize);
		LayCastListBare(castList);
	}
	
	public void createClasses(int numOfPersons, int classSize) {
		System.out.println("Creating classes with class size " + classSize + ".");
		int currentClass = 1;
		int currentClassSize = 0;
		for(Person eachPerson : castList) {
			if(currentClassSize == classSize) {
				//Preemptive breaking of loop before adding if class is full
				currentClassSize = 0;
				currentClass++;
		}
		currentClassSize++;
		eachPerson.setClassId(currentClass);	
		}
	}
	
	
	public void LayCastListBare(List<Person> castList)
	{
		for(Person eachPerson : castList)
		{
			System.out.println("ID: " + eachPerson.getId());
			System.out.println("Class ID: " + eachPerson.getClassId());
			System.out.println("Body");
			System.out.println("----");
			eachPerson.printBody();
		}
	}
}
