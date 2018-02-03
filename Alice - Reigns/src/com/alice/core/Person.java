package com.alice.core;
import java.util.ArrayList;
import java.util.List;

import com.alice.core.Relationship;
import com.alice.core.Relationship.status;
import com.alice.core.occupations.Occupation;


public class Person {
	// NPC class
	Body thisBody;
	Person spawner; //This is a seperate relationship just for the person who 'spawned' this person.
	List<Relationship> relationshipArray;
	int relationships = -101; //This is the number of maximum relationships this person can have.
	
	int family = -1;
	
	public void addRelationship(Relationship newRelationship) {
		relationshipArray.add(newRelationship);
	}
	
	public List<Relationship> getRelationship() {
		return relationshipArray;
	}
	
	
	//Initialize body without clothes if it doesn't exist.
	public void setBody(Body newBody) {
		if (null == thisBody) {
			thisBody = newBody;
		}
	}
	
	public Body getBody()
	{
		return thisBody;
	}

	//Debugging routine for now.
	public void printBody()
	{
		System.out.println("Hair: "+thisBody.getHair());
		System.out.println("Eye type: "+thisBody.getEyeType());
		System.out.println("Eye color: "+thisBody.getEyeColor());
		System.out.println("Breasts: "+thisBody.getBreasts());
		System.out.println("Ass: "+thisBody.getAss());
		System.out.println("Body type: "+thisBody.getBodyType());
	}
	
	public void normalizeRelationships() {
		
	}
	
	public int returnSisterCount() {
		int sisterCount = 0;
		for(Relationship relation : relationshipArray) {
			if(relation.relationshipStatus == status.sister) {
			sisterCount++;
			}
		}
		for (Relationship relation : relationshipArray) {
			if(relation.relationshipStatus ==status.sister) {
				sisterCount++;
			}
		}
		return sisterCount;
	}
	
	public int returnCousinCount() {
		int cousinCount = 0;
		for(Relationship relation : relationshipArray) {
			if(relation.relationshipStatus == status.cousin) {
			cousinCount++;
			}
		}
		for (Relationship relation : relationshipArray) {
			if(relation.relationshipStatus ==status.cousin) {
				cousinCount++;
			}
		}
		return cousinCount;
	}
	
	
}
