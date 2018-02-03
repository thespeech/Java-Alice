package com.alice.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.alice.core.Person;

public class Main {

	
	public static void main(String[] args) {
		//Entry point.

		List<Person> arrayPersons = new ArrayList<Person>();
		PeopleGenerator rootGenerator = new PeopleGenerator(arrayPersons);

		System.out.println("This is a prototype version of Alice - Reigns.");
		System.out.println("As a slime, you need to survive by moving from host to host.");
		System.out.println("Each host offers more and less of certain resources you need to survive.");
		System.out.println("While in a host, you have to partake in certain events to maintain your cover,");
		System.out.println("though you can also choose to do something else. This will increase suspicion.");
		System.out.println("Characters will be dynamically generated on the fly - one-level relationships.");
		System.out.println("For now, the game goal is to find your crush and possess her.");
		System.out.println("Unfortunately, you've forgotten her key traits in your transformation into a slime.");
		System.out.println("When you possess hosts with traits similar to hers, you can recover your memories.");
		System.out.println("Just like Mastermind, you feel a growing sense of familiarity the more similar the body and personality traits become.");
		System.out.println("Generated characters remain, so it is possible for the target to already be generated and you to miss her.");
		System.out.println("You can input the guessed traits onto a list, and look up which previously generated character meets your criteria.");
	
		System.out.println("\n");
		System.out.println("You stumbled home drunk one night after an intense breakup with your girlfriend.");
		System.out.println("She was sweet, but it turns out that she had been dating you");
		System.out.println("in the first place because your phenotype was the ideal for the drug her");
		System.out.println("company had wanted to test - a CRISPR nanomachine swarm that alters the");
		System.out.println("nervous system to be adaptable and compatible with all other human bodies.");
		System.out.println("The secret trial has ended, and you were showing no discernable effects.");
		System.out.println("Extremely fidgety during the date tonight, she accidentally sent a message");
		System.out.println("detailing you at the \"end-phase of experiment\" to you instead of her boss.");
		System.out.println("She confessed everything when you grilled her, and left in a huff, claiming");
		System.out.println("that an 'extreme emotional response' was required to catalyze the changes,");
		System.out.println("and the lack of that throughout the relationship meant that you never loved");
		System.out.println("her anyway, so nothing of value was lost.");
		System.out.println("\n");
		System.out.println("You entered your bathroom and sat down to take a shit on the toilet.");
		System.out.println("The feeling of dropping a smooth log was as satisfying as always, but");
		System.out.println("then you kept shitting...and shitting...");
		System.out.println("You looked down and noticed a large amount of blood pooling into the bowl,");
		System.out.println("as well as some transparent, thick, slime.");
		System.out.println("It felt similar to vomiting, only from the other end, and painless.");
		System.out.println("As you passed out in an alcoholic stupor on the toilet bowl, you vaguely wondered");
		System.out.println("if you were hallucinating.");
		
		System.out.println("\n");
		System.out.println("You wake up in a dark place.");
		System.out.println("You feel as though you're stuffed into a tube, and rushing along at a great speed.");
		System.out.println("Above you, you see light, and instinctively push towards it.");
		System.out.println("As it occurs to you that you're pushing against the walls of the tube with cilia instead");
		System.out.println("of hands, you emerge into the light.");
		System.out.println("You notice smooth porcelain around you.");
		System.out.println("Somehow, you are in a toilet bowl.");
		System.out.println("Looking around you, you determine that you are inhabiting the form of the slime you shat out earlier.");
		System.out.println("You find that you can jump, but your cilia find no purchase on the smooth porcelain of the bowl.");
		System.out.println("You realize you can only look for one person who knows what happened to you - your ex.");
		System.out.println("Unfortunately, it seems that your memory is shot full of holes in what seems to be a permanent");
		System.out.println("alcoholic haze. It also seems that you feel extremely hungry.");
		
		
	}
	}