package io.spring.springbootstarter.Student;

public class Student {

	private String name;
	private int ID;
	private int score;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Student(String name, int iD, int score) {
		super();
		this.name = name;
		ID = iD;
		this.score = score;
	}

}
