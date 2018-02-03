package com.alice.core;

import java.util.ArrayList;
import java.util.List;

public class Clique {
	int cliqueId;
	List<Person> cliqueMembers;
	String definingCharacteristic;
	List<String> sharedInterests;
	
	public Clique() {
		cliqueId = -1;
		definingCharacteristic = "";
		cliqueMembers = new ArrayList<Person>();
		sharedInterests = new ArrayList<String>();
	}
}
