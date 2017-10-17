package com.alice.core;

public class Club {
//Leave this alone first - get MVP working.
	private int minNumber;
	private int maxNumber;
	private String name;
	public Club(String name) {
		this.name = name;
		if(name == "chess") {
			minNumber = 4;
			maxNumber = 20;
		}
		if(name == "dance") {
			minNumber = 10;
			maxNumber = 25;
		}
		if(name == "basketball") {
			minNumber = 20;
			maxNumber = 40;
		}
	}
}
