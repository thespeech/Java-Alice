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
	
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return this.id;
	}

	//Debugging routine for now.
	public void printBody()
	{
		System.out.println("Hair: "+thisBody.getHair());
		System.out.println("Eye type: "+thisBody.getEyeType());
		System.out.println("Eye color: "+thisBody.getEyeColor());
		System.out.println("Breasts: "+thisBody.getBreasts());
		System.out.println("Ass: "+thisBody.getAss());
		System.out.println("Body type: "+thisBody.getBodyType());
	}
	
}
