package com.alice.core;

//Traits are basically a person's natural tendencies.
//Hotheaded, confident, ditzy, etc.
public class Trait {
	private int id; // ID of the trait.
	private int percentage; // Percentage

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
