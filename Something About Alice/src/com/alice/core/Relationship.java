package com.alice.core;
import java.util.List;

public class Relationship {

	Relationship(int id)
	{
		this.id = id;
	}
	
	private int id; // Id of the relation.
	// The below numbers are modified by forgettable factors ONLY, which can
	// still be part of memories that will still have hard effects later. Actual
	// numbers are calculated at runtime.
	private int friendship; // -100 to 100; essentially how much this person
							// likes the relation as a friend.
							// Implicitly includes an assumed level of
							// understanding as to the relation's friendship
							// towards this person. Can be base-modified with
							// events (reassuring talks, good advice, standing
							// up for the person during class, etc.)
	private int romanticship; // 0 to 100; How much this person desires the
								// relation romantically. Can be base-modified
								// with events (impressed by exceptionally
								// eloquent speech, heroic action, etc.)
	private int sexualship; // -100 to 100; How much this person lusts for the
							// relation. Can be base-modified with
							// mannerism-during-events, clothing-during-events, etc.
	
	//Resource pools, which drain when certain events happen.
	private int interactionDesire; //Current patience/desire this person has for interaction with this relation
	private int interactionDesireCap; //The maximum desire/patience this person has for interaction
	private int trust; //Current trust that this person has with regard to the relation 
	private int trustDesireCap; //The maximum trust that this person can get to for the relation.
	private int devotion; //How much this person can compromise their own desires for the relation.
	private int devotionCap; //The maximum they can help.

	
	// Below represent miscellaneous known information which can modify the
	// person's decisions concerning the relation during events.
	private List<Belief> knownBeliefs;
	private List<Trait> knownTraits;

	public int getId() {
		return this.id;
	}
	
	public int getFriendship(){
		return this.friendship;
	}
	
	public void setFriendship(int friendship){
		this.friendship = friendship;
	}
	
	public int getRomanticship(){
		return this.romanticship;
	}
	
	public void setRomanticship(int romanticship){
		this.romanticship = romanticship;
	}
	
	public int getSexualship(){
		return this.sexualship;
	}
	
	public void setSexualship(int sexualship){
		this.sexualship = sexualship;
	}
	
	public int getInteractionDesire(){
		return this.interactionDesire;
	}
	
	public void setInteractionDesire(int interactionDesire){
		this.interactionDesire= interactionDesire;
	}
	
	public int getTrust(){
		return this.trust;
	}
	
	public void setTrust(int trust){
		this.trust = trust;
	}
	
	public int getDevotion(){
		return this.devotion;
	}
	
	public void setDevotion(int devotion){
		this.devotion= devotion;
	}
}
