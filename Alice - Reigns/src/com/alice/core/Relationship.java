package com.alice.core;

	
public class Relationship {
	public enum status {sister, cousin, colleague, girlfriend, schoolmate}
	Person relationshipOwner;
	Person relation;
	int relationshipWellness = 0;
	int respect = 0;
	int sexualAttraction = 0;
	status relationshipStatus;
}
