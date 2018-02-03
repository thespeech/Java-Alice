package com.alice.core;

import com.alice.core.Relationship;
import com.alice.core.Relationship.status;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PeopleGenerator {

	List<Person> totalPersons;
	
	List<String> hairBuffer;
	List<String> eyeTypeBuffer;
	List<String> eyeColorBuffer;
	List<String> breastsBuffer;
	List<String> assBuffer;
	List<String> bodyTypeBuffer;
	
	
	int familyHighwaterMark = 0;
	int cousinPercentage = 30;  //Chance of there being a cousin.
	OccupationGenerator occupationGenerator; 
	Random rand;
	public PeopleGenerator(List<Person> totalPersons) {
		loadFemaleDataFromFiles();
		
		rand = new Random(System.currentTimeMillis());
		this.totalPersons = totalPersons; //Pass object to this for easy reference.
	}

	private void loadFemaleDataFromFiles() {
		//Read everything into lists of strings in memory.
		Path currentPath;
		Charset charset = StandardCharsets.UTF_8;
		try {
			currentPath = Paths.get("./data/female", "hair.txt");
			hairBuffer = Files.readAllLines(currentPath, charset);
			currentPath = Paths.get("./data/female", "eyes.txt");
			eyeTypeBuffer = Files.readAllLines(currentPath, charset);
			currentPath = Paths.get("./data/female", "eyecolor.txt");
			eyeColorBuffer = Files.readAllLines(currentPath, charset);
			currentPath = Paths.get("./data/female", "breasts.txt");
			breastsBuffer = Files.readAllLines(currentPath, charset);
			currentPath = Paths.get("./data/female", "ass.txt");
			assBuffer = Files.readAllLines(currentPath, charset);
			currentPath = Paths.get("./data/female", "body.txt");
			bodyTypeBuffer = Files.readAllLines(currentPath, charset);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	

	// This function assumes data already loaded into lists
	private Body generateRandomBody() {

		String rHair = hairBuffer.get(rand.nextInt(hairBuffer.size()));
		String rEyeType = eyeTypeBuffer.get(rand.nextInt(eyeTypeBuffer.size()));
		String rEyeColor = eyeColorBuffer.get(rand.nextInt(eyeColorBuffer
				.size()));
		String rBreasts = breastsBuffer.get(rand.nextInt(breastsBuffer.size()));
		String rAss = assBuffer.get(rand.nextInt(assBuffer.size()));
		String rBodyType = bodyTypeBuffer.get(rand.nextInt(bodyTypeBuffer
				.size()));
		Body newBody = new Body(rHair, rEyeType, rEyeColor, rBreasts, rAss,
				rBodyType);
		return newBody;
	}

	private Person generatePerson() {
		Person newPerson = new Person();
		newPerson.setBody(generateRandomBody());
		return newPerson;
	}
	
	
	private Person generateSisterPerson(Person rootPerson) {
		Person newPerson = new Person();
		newPerson.setBody(generateRelatedBody(rootPerson));
		return newPerson;
	}
	
	private Body generateRelatedBody(Person rootPerson) {
		Person newPerson = new Person();
		String iHair = rootPerson.getBody().getHair();
		String iEyeColor = rootPerson.getBody().getEyeColor();
		String rEyeType = eyeTypeBuffer.get(rand.nextInt(eyeTypeBuffer.size()));
		String rBreasts = breastsBuffer.get(rand.nextInt(breastsBuffer.size()));
		String rAss = assBuffer.get(rand.nextInt(assBuffer.size()));
		String rBodyType = bodyTypeBuffer.get(rand.nextInt(bodyTypeBuffer
				.size()));
		Body newBody = new Body(iHair, rEyeType, iEyeColor, rBreasts, rAss, rBodyType);
		return newBody;
	}
	
	
	private void generateFirstLevelRelationships(Person thisPerson) {
		//This function generates both fresh new people and connects to old people.
		Person newPerson = new Person();
		newPerson.setBody(generateRandomBody());
		//First, check if this person is the original.
		if(newPerson.spawner != null){
			System.out.println("This person is not the progenitor.");
		}
		else {
			//This person is the progenitor.
			thisPerson.family = familyHighwaterMark;
			thisPerson.relationships= rand.nextInt(3) + 7;
			familyHighwaterMark++;
			//First generate sisters, 0 to 2, equal chance.
			//All this stuff should be more tailored in the future.
			int sisterNumber = rand.nextInt(3);
			ArrayList<Person> sisterList = new ArrayList<Person>(); //Temp holding array

			for(int i = 0; i < sisterNumber; i++) {
				Person newSister = generateSisterPerson(thisPerson);
				newSister.family = thisPerson.family;
				newSister.spawner = thisPerson; 
				totalPersons.add(newSister); //Add to total people
				sisterList.add(newSister); //Add to temp array for familial assignment
			}
			sisterList.add(thisPerson);

			for(Person sisterRelationshipOwner : sisterList){
				for(Person sisterConsidered : sisterList){
					//Establish basic relationships for all sisters.
					//It is always the onus of the relationship creator to generate reciprocating relationships for the people she creates.
					if(sisterRelationshipOwner != sisterConsidered){
						Relationship newRelationship = new Relationship();
						newRelationship.relationshipOwner = sisterRelationshipOwner;
						newRelationship.relation = sisterConsidered;
						newRelationship.relationshipStatus = status.sister;
						newRelationship.relationshipWellness = rand.nextInt(101);
						newRelationship.respect = rand.nextInt(101);
						newRelationship.sexualAttraction = rand.nextInt(101); //Right now just set all to 0-100 random for testing.
																			  //Though of course it is also possible sisters are attracted.
						sisterRelationshipOwner.addRelationship(newRelationship);
						//Later still have to crawl through all relationships and equalize them.
					}
					
				}
			}
			//Now generate cousins - for now we assume only 1 cousin at most.
			//Cousins do not 'belong' to the family - they have one of their own. Family only identifies sisters and mothers. Nevertheless there should
			//only be up to one cousin for every person, and a finite percentage of the population so everyone doesn't end up having one cousin.
			if(rand.nextInt(101) < cousinPercentage) { 
			Person newCousin = generatePerson();
			Relationship newRelationship = new Relationship();
			newRelationship.relationshipOwner = thisPerson; 
			newRelationship.relation = newCousin;
			newRelationship.relationshipStatus = status.cousin;
			newRelationship.relationshipWellness = rand.nextInt(101);
			newRelationship.respect = rand.nextInt(101);
			newRelationship.sexualAttraction = rand.nextInt(101); //Right now just set all to 0-100 random for testing.
			thisPerson.addRelationship(newRelationship);
			//Then generate reciprocating relationship for the cousin.
			Relationship newCousinRelationship = new Relationship();
			newCousinRelationship.relationshipOwner = newCousin;
			newCousinRelationship.relation = thisPerson;
			newCousinRelationship.relationshipStatus = status.cousin;
			newCousinRelationship.relationshipWellness = rand.nextInt(101);
			newCousinRelationship.respect = rand.nextInt(101);
			newCousinRelationship.sexualAttraction = rand.nextInt(101);
			newCousin.addRelationship(newCousinRelationship);
		}
	}

	}
	
	

	
}
