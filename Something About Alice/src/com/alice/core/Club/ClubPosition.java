package com.alice.core.Club;

import com.alice.core.Person;

enum PositionType {head, viceHead, treasurer, secretary, importantMember, member};

public class ClubPosition {
	String title;
	Person occupant;
	PositionType position; //The "meta" type of position this is - most events will run off this, but use the title in event text instead.
						   //If someone is an importantMember, it will check whether the event in question might affect their title first.
	
	public ClubPosition(String thisTitle) {
		title = thisTitle;
	}
	
}
