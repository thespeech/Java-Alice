package com.alice.core;


//Mostly boilerplate code for storing information in this object
public class Body {
	// Physical characteristics
	private String hair;
	private String eyeType;
	private String eyeColor;
	private String breasts;
	private String ass;
	private String bodyType;
	private String clothes; // Clothes are separate and don't get initialized
							// with the rest

	public Body(String hair, String eyeType, String eyeColor, String breasts,
			String ass, String bodyType) {
		setHair(hair);
		setEyeType(eyeType);
		setEyeColor(eyeColor);
		setBreasts(breasts);
		setAss(ass);
		setBodyType(bodyType);
	}

	public void setHair(String hair) {
		this.hair = hair;
	}

	public String getHair() {
		return this.hair;
	}

	public void setEyeType(String eyeType) {
		this.eyeType = eyeType;
	}

	public String getEyeType() {
		return this.eyeType;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getEyeColor() {
		return this.eyeColor;
	}

	public void setBreasts(String breasts) {
		this.breasts = breasts;
	}

	public String getBreasts() {
		return this.breasts;
	}

	public void setAss(String ass) {
		this.ass = ass;
	}

	public String getAss() {
		return this.ass;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public String getBodyType() {
		return this.bodyType;
	}

	public void setClothes(String clothes) {
		this.clothes = clothes;
	}
}
