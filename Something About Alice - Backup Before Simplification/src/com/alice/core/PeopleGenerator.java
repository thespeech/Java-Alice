package com.alice.core;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PeopleGenerator {

	List<String> hairBuffer;
	List<String> eyeTypeBuffer;
	List<String> eyeColorBuffer;
	List<String> breastsBuffer;
	List<String> assBuffer;
	List<String> bodyTypeBuffer;
	
	Random rand ;
	public PeopleGenerator() {
		loadDataFromFiles();
		rand = new Random(System.currentTimeMillis());
	}

	private void loadDataFromFiles() {
		Path currentPath;
		Charset charset = StandardCharsets.UTF_8;
		try {
			currentPath = Paths.get("./data/", "hair.txt");
			hairBuffer = Files.readAllLines(currentPath, charset);
			currentPath = Paths.get("./data/", "eyes.txt");
			eyeTypeBuffer = Files.readAllLines(currentPath, charset);
			currentPath = Paths.get("./data/", "eyecolor.txt");
			eyeColorBuffer = Files.readAllLines(currentPath, charset);
			currentPath = Paths.get("./data/", "breasts.txt");
			breastsBuffer = Files.readAllLines(currentPath, charset);
			currentPath = Paths.get("./data/", "ass.txt");
			assBuffer = Files.readAllLines(currentPath, charset);
			currentPath = Paths.get("./data/", "body.txt");
			bodyTypeBuffer = Files.readAllLines(currentPath, charset);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	// This function assumes data already loaded into lists
	private Body generateRandomBody() {
		String rHair = hairBuffer.get(rand.nextInt(hairBuffer.size()));
		String rEyeType = eyeTypeBuffer.get(rand.nextInt(eyeTypeBuffer.size()));
		String rEyeColor = eyeColorBuffer.get(rand.nextInt(eyeColorBuffer
				.size()));
		String rBreasts = breastsBuffer.get(rand.nextInt(breastsBuffer.size()));
		String rAss = assBuffer.get(rand.nextInt(assBuffer.size()));
		String rBodyType = bodyTypeBuffer.get(rand.nextInt(bodyTypeBuffer
				.size()));
		Body newBody = new Body(rHair, rEyeType, rEyeColor, rBreasts, rAss,
				rBodyType);
		return newBody;
	}

	private Person generatePerson(int id) {
		Person newPerson = new Person();
		newPerson.setId(id);
		newPerson.setBody(generateRandomBody());
		return newPerson;
	}

	public List<Person> createCastList(int numOfPersons) {
		List<Person> castList = new ArrayList<Person>();
		for(int i=0;i<numOfPersons;i++){
			castList.add(generatePerson(i));
		}
		return castList;
	}
	
}
