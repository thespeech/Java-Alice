package com.alice.core.organizations;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

import com.alice.core.Person;

public class Organization_HighSchoolGenerator {

	List<String> highSchoolNames;
	List<String> highSchoolDescs;
	List<Person> totalPersons;
	String name;
	String desc;
	Random rand;
	
	public Organization_HighSchoolGenerator() {
		rand = new Random(System.currentTimeMillis());
		loadDataFromFiles();
	}


	private void loadDataFromFiles() {
		//Read everything into lists of strings in memory.
		Path currentPath;
		Charset charset = StandardCharsets.UTF_8;
		try {
			currentPath = Paths.get("./data/orgs", "highSchoolNames.txt");
			highSchoolNames = Files.readAllLines(currentPath, charset);
			currentPath = Paths.get("./data/orgs", "highSchoolDesc.txt");
			highSchoolDescs = Files.readAllLines(currentPath, charset);

		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public Organization_HighSchool generateHighSchool() {
		name = highSchoolNames.get(rand.nextInt(highSchoolNames.size()));
		desc = highSchoolDescs.get(rand.nextInt(highSchoolDescs.size()));
		Organization_HighSchool newHighSchool = new Organization_HighSchool(name, desc);
		return newHighSchool;
	}
	
}