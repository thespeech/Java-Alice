package com.alice.core;

import java.util.ArrayList;
import java.util.List;

public class CommonRelationship {
	
	//If you strip everything that makes people different away from them, a relationship is symmetrical. This expresses that.
	
	List<RelationshipEffect> commonRelationshipEffects;
	int commonIntimacy;
	int commonPassion;
	int commonCommitment;

	CommonRelationship() {
		commonRelationshipEffects = new ArrayList<RelationshipEffect>();
		commonIntimacy=0;
		commonPassion=0;
		commonCommitment=0;
	}
	
	
	

}
