package com.alice.core;

public class Place {
	// Place class
	// Places affect the kinds of events that can occur, how those events occur,
	// and the type and number of people that are likely to be present. 
	private int id; // Identifies the place.
	private String baseDescription; // Base description of the place.
	private String type; // Cafeteria, Gym, Office, Classroom, Toilet,
							// UtilityCloset, Lab, Corridor, Clubroom, Court,
							// ChangingRoom
	private String subtype; // Assorted clubs, badminton, baseball, council,
							// etc.

	// This won't change after generation, so no need to create setters.

	Place(int id, String baseDescription, String type, String subtype) {
		this.id = id;
		this.baseDescription = baseDescription;
		this.type = type;
		this.subtype = subtype;
	}

	public int getId() {
		return this.id;
	}

	public String getBaseDescription() {
		return this.baseDescription;
	}

	public String getType() {
		return this.type;
	}

	public String getSubtype() {
		return this.subtype;
	}
}
