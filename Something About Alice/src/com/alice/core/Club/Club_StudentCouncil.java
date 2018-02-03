package com.alice.core.Club;

import java.util.List;

import com.alice.core.Person;

public class Club_StudentCouncil extends Club {

	//The student council passes far-reaching legistation that affects all aspects of student life. The power
	//of that legislation depends on the overall respect of the student body for this organization, as well as
	//the amount of leeway the administration allows it.
	//This respect depends on the individuals running the council; each individual adds or subtracts respect score.
	//Administration leeway is unaffected by individuals, and more resembles edicts handed down from On High.
	
	ClubPosition head = new ClubPosition("President");
	ClubPosition vicePresident = new ClubPosition("Vice-President");
	ClubPosition treasurer = new ClubPosition("Treasurer");
	ClubPosition PRHead = new ClubPosition("Public Relations Director");
	
	List<ClubPosition> Secretaries; //2
	List<Person> ClassRepresentatives; //As many as there are classes.
	List<Person> CCAHeads; //As many as there are clubs, excluding SC.
	
	int BaseStudentRespect;
	int AdministrationLeeway;
	
	public Club_StudentCouncil() {
		minLimit = -1; 
		maxLimit = -1; //These are not used in generation.
	}

}
