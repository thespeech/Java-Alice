package com.alice.core;
import java.util.*;

public class PeopleManager {
	PeopleGenerator mainGenerator;
	List<Person> castList;
	
	public void createPeople(int numOfPersons) {
		System.out.println("Creating people.");
		mainGenerator = new PeopleGenerator();
		castList = mainGenerator.createCastList(numOfPersons);
		LayCastListBare(castList);
	}
	
	public void LayCastListBare(List<Person> castList)
	{
		for(Person eachPerson : castList)
		{
			System.out.println("ID: " + eachPerson.getId());
			System.out.println("Body");
			System.out.println("----");
			eachPerson.printBody();
		}
	}
}
