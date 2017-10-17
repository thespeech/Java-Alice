package com.alice.core;

//Beliefs are things that have large consequences for how an NPC decides on choices.
//These include, for example, the type of belief in a higher power, karma, hard work, etc.
//Also includes things like the value of fairness versus survival of the fittest, lying versus honesty, etc.
//Mostly, differences between a belief and a trait:
//Traits cannot be changed as easily as beliefs.
//Beliefs can be changed through argument and counter-examples.
//Traits can only be changed through constant practice and wearing down.
public class Belief {
	private int id; // ID of the belief.
	private int percentage; // How much they believe that.

	// Auto-regulates amounts being added so that they're reasonable.
	public void editPercentage(int amount) {
		percentage += amount;
		if (percentage > 100) {
			percentage = 100;
		}
		if (percentage <= 0) {
			percentage = 1; // Traits cannot be completely eradicated except by
							// events.
		}
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public int getPercentage() {
		return percentage;
	}
}
