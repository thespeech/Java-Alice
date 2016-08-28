package com.alice.core;

class Person {
	// NPC class
	private int id; // Identifies the person.
	Brain thisBrain;
	Body thisBody;

	//Initialize body without clothes if it doesn't exist.
	public void setBody(Body newBody) {
		if (null == thisBody) {
			thisBody = newBody;
		}
	}
	
	public Body getBody()
	{
		return thisBody;
	}
}
