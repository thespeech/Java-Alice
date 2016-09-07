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
							// treasures the friendship with the relation.
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
	
	public int getRomanticship(){
		return this.romanticship;
	}
	
	public int getSexualship(){
		return this.sexualship;
	}
}
