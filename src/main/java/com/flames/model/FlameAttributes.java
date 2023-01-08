package com.flames.model;

public class FlameAttributes {

	private String maleName;
	private String femaleName;

	public FlameAttributes() {
	}

	public FlameAttributes(String maleName, String femaleName) {
		super();
		this.maleName = maleName;
		this.femaleName = femaleName;
	}

	public String getMaleName() {
		return maleName;
	}

	public void setMaleName(String maleName) {
		this.maleName = maleName;
	}

	public String getFemaleName() {
		return femaleName;
	}

	public void setFemaleName(String femaleName) {
		this.femaleName = femaleName;
	}

}
