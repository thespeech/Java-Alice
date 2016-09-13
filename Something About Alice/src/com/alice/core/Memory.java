package com.alice.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//This class basically stores information needed for events that rely on past events
public class Memory {

	private int id; // Id of the memory type - related to event type
	private int age; // Days since memory.
	List<Integer> idsOfPeopleInvolved; // For quick reference.
	Map memoryMap; // Since it varies on each memory, must create

	public Memory() {
		memoryMap = new HashMap<String, String>(); // Flexible based on event
													// which produced it.
													// Responsibility of
													// interpreting it belongs
													// to event
													// which evaluates it.
	}
}
