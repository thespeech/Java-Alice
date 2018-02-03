package com.alice.core;

import java.util.List;

public class RelationshipEffectTemplate {
	//Used for generating relationship effects.
	int id;
	String name;
	String description;
	Boolean secret;
	int minDuration;
	int maxDuration;
	int minIntimacyEffect;
	int maxIntimacyEffect;
	int minPassionEffect;
	int maxPassionEffect;
	int minCommitmentEffect;
	int maxCommitmentEffect;
	List<String> miscKeys; //Some effects key off keywords instead of id.
}