package com.alice.core;

import java.util.ArrayList;
import java.util.List;

public class Classgroup {

	int id;
	List<Person> members;
	List<Clique> cliqueList;
	
	public Classgroup() {
		members = new ArrayList<Person>();
		cliqueList = new ArrayList<Clique>();
		id = 0;
	}
}
