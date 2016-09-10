package com.alice.core;

import java.util.List;

public class Relationship {

	Relationship(int id) {
		this.id = id;
	}

	private int id; // Id of the relation.
	// The below numbers are modified by forgettable factors ONLY, which can
	// still be part of memories that will still have hard effects later. Actual
	// numbers are calculated at runtime.
	// These are modifiers to the real values.
	private int friendshipMod; // Essentially how much this person
								// likes the relation as a friend due to the
								// general impression left behind by events. Can
								// be base-modified with
								// events (reassuring talks, good advice,
								// standing
								// up for the person during class, etc.)
	private int romanticshipMod; // How much this person wants to be in a
									// serious relationship with
									// the relation romantically, due to general
									// impression left behind by events. Can be
									// base-modified
									// with events (impressed by exceptionally
									// eloquent speech, heroic action, etc.)
	private int sexualshipMod; // How much this person lusts for
								// the
								// relation, due to general impression left
								// behind by events. Can be base-modified with
								// mannerism-during-events,
								// clothing-during-events, etc.

	// Actual numbers to be pulled and calculated.
	private int friendship; // Latest friendship score, calculated each turn.
	private int romanticship; // Latest romantic score, calculated each turn.
	private int sexualship; // Latest sexual score, calculated each turn.

	// Resource pools, which drain when certain events happen.
	private int interactionDesire; // Current patience/desire this person has
									// for interaction with this relation
	private int interactionDesireCap; // The maximum desire/patience this person
										// has for interaction
	private int trust; // Current trust that this person has with regard to the
						// relation
	private int trustDesireCap; // The maximum trust that this person can get to
								// for the relation.
	private int devotion; // How much this person can compromise their own
							// desires for the relation.
	private int devotionCap; // The maximum they can help.

	// Below represent miscellaneous known information which can modify the
	// person's decisions concerning the relation during events.
	private List<Belief> knownBeliefs;
	private List<Trait> knownTraits;
	private List<Memory> associatedMemories; // Every event gives rise to a
												// unique, objective memory;
												// this contains references to
												// those memories which this
												// person experienced with the
												// relation.

	public int getId() {
		return this.id;
	}

	public int getFriendship() {
		return this.friendship;
	}

	public void setFriendship(int friendship) {
		this.friendship = friendship;
	}

	public int getRomanticship() {
		return this.romanticship;
	}

	public void setRomanticship(int romanticship) {
		this.romanticship = romanticship;
	}

	public int getSexualship() {
		return this.sexualship;
	}

	public void setSexualship(int sexualship) {
		this.sexualship = sexualship;
	}

	public int getFriendshipMod() {
		return this.friendshipMod;
	}

	public void setFriendshipMod(int friendshipMod) {
		this.friendshipMod = friendshipMod;
	}

	public int getRomanticshipMod() {
		return this.romanticshipMod;
	}

	public void setRomanticshipMod(int romanticshipMod) {
		this.romanticshipMod = romanticshipMod;
	}

	public int getSexualshipMod() {
		return this.sexualshipMod;
	}

	public void setSexualshipMod(int sexualshipMod) {
		this.sexualshipMod = sexualshipMod;
	}

	public int getInteractionDesire() {
		return this.interactionDesire;
	}

	public void setInteractionDesire(int interactionDesire) {
		this.interactionDesire = interactionDesire;
	}

	public int getTrust() {
		return this.trust;
	}

	public void setTrust(int trust) {
		this.trust = trust;
	}

	public int getDevotion() {
		return this.devotion;
	}

	public void setDevotion(int devotion) {
		this.devotion = devotion;
	}
	
	public List<Memory> getAssociatedMemories() {
		return this.associatedMemories;
	}

	public void addMemory(Memory toBeAdded) {
		associatedMemories.add(toBeAdded);
	}
	
	public void deleteMemory(Memory toBeDeleted) {
		associatedMemories.remove(toBeDeleted);
	}
	
	public List<Trait> getKnownTraits() {
		return this.knownTraits;
	}
	
	public void addTrait(Trait toBeAdded){
		this.knownTraits.add(toBeAdded);
	}
	
	public void removeTrait(Trait toBeDeleted){
		this.knownTraits.remove(toBeDeleted);
	}
	
	public List<Belief> getKnownBeliefs() {
		return this.knownBeliefs;
	}
	
	public void addBelief(Belief toBeAdded){
		this.knownBeliefs.add(toBeAdded);
	}
	
	public void removeBelief(Belief toBeDeleted){
		this.knownBeliefs.remove(toBeDeleted);
	}
	
}
