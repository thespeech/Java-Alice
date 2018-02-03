package com.alice.core.organizations;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class Organization_UniversityGenerator {

	List<String> universityNames;
	List<String> universityDescs;
	String name;
	String desc;
	Random rand;

	public Organization_UniversityGenerator() {
		rand = new Random(System.currentTimeMillis());
		loadDataFromFiles();
	}


	private void loadDataFromFiles() {
		//Read everything into lists of strings in memory.
		Path currentPath;
		Charset charset = StandardCharsets.UTF_8;
		try {
			currentPath = Paths.get("./data/orgs", "universityNames.txt");
			universityNames = Files.readAllLines(currentPath, charset);
			currentPath = Paths.get("./data/orgs", "universityDescs.txt");
			universityDescs = Files.readAllLines(currentPath, charset);

		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public Organization_University generateUniversity() {
		name = universityNames.get(rand.nextInt(universityNames.size()));
		desc = universityDescs.get(rand.nextInt(universityDescs.size()));
		Organization_University newUni = new Organization_University(name, desc);
		return newUni;
	}
	
}