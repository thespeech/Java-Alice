package com.alice.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Memory {

	private int id; //Id of the memory type - related to event type
	private int age; //Days since memory.
	List<Integer> idsOfPeopleInvolved; //For quick reference.
	Map memoryMap; //Since it varies on each memory, must create
	
	public Memory() {
		memoryMap = new HashMap<String, String>(); //Flexible based on events.
	}
}
