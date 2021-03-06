package com.alice.core;

import java.util.ArrayList;
import java.util.List;

public class PlaceGenerator {

	public List<Place> makeSchool(int studentCount) {
		List<Place> placeList = new ArrayList<Place>();
		// First build mandatory areas.
		String desc = "This is the cafeteria.";
		Place toAdd = new Place(placeList.size(), desc, "cafeteria", null);
		placeList.add(toAdd);
		desc = "This is the gym.";
		toAdd = new Place(placeList.size(), desc, "gym", null);
		desc = "This is the teacher's office.";
		toAdd = new Place(placeList.size(), desc, "office", null);
		desc = "This is the chemistry lab.";
		toAdd = new Place(placeList.size(), desc, "lab", "chemistry");
		desc = "This is the physics lab.";
		toAdd = new Place(placeList.size(), desc, "lab", "physics");
		desc = "This is the biology lab.";
		toAdd = new Place(placeList.size(), desc, "lab", "biology");
		// Assign students evenly to classes, based on number.
		// Rules for classes - more than 15 students per class.
		// At least 2 classes.
		// If there are not enough students left to make a class, divide the
		// remainder evenly among classes as much as possible.
		return placeList;
	}

}
