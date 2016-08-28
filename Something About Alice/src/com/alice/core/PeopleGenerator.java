package com.alice.core;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class PeopleGenerator {

	List<String> hairBuffer;
	List<String> eyeTypeBuffer;
	List<String> eyeColorBuffer;
	List<String> breastsBuffer;
	List<String> assBuffer;
	List<String> bodyTypeBuffer;

	public PeopleGenerator() {
		loadDataFromFiles();
	}

	private void loadDataFromFiles() {
		Path currentPath;
		Charset charset = StandardCharsets.UTF_8;
		try {
			currentPath = Paths.get("/data/", "hair.txt");
			hairBuffer = Files.readAllLines(currentPath, charset);
			currentPath = Paths.get("/data/", "eyes.txt");
			eyeTypeBuffer = Files.readAllLines(currentPath, charset);
			currentPath = Paths.get("/data/", "eyecolor.txt");
			eyeColorBuffer = Files.readAllLines(currentPath, charset);
			currentPath = Paths.get("/data/", "breasts.txt");
			breastsBuffer = Files.readAllLines(currentPath, charset);
			currentPath = Paths.get("/data/", "ass.txt");
			assBuffer = Files.readAllLines(currentPath, charset);
			currentPath = Paths.get("/data/", "body.txt");
			bodyTypeBuffer = Files.readAllLines(currentPath, charset);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	// This function assumes data already loaded into lists
	private Body generateRandomBody() {
		Random rand = new Random(System.currentTimeMillis());
		String rHair = hairBuffer.get(rand.nextInt(hairBuffer.size()));
		String rEyeType = eyeTypeBuffer.get(rand.nextInt(eyeTypeBuffer.size()));
		String rEyeColor = eyeColorBuffer.get(rand.nextInt(eyeColorBuffer
				.size()));
		String rBreasts = breastsBuffer.get(rand.nextInt(breastsBuffer.size()));
		String rAss = assBuffer.get(rand.nextInt(assBuffer.size()));
		String rBodyType = bodyTypeBuffer.get(rand.nextInt(bodyTypeBuffer.size()));
		Body newBody = new Body(rHair, rEyeType, rEyeColor, rBreasts, rAss, rBodyType);
		return newBody;
	}
	
	private Person generatePerson()
	{
		Person newPerson = new Person();
		newPerson.setBody(generateRandomBody());
		//generateRandomBrain(newPerson); //Still to be implemented.
		return newPerson;
	}
	
}
