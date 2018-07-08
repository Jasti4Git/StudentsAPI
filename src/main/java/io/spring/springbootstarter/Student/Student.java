package io.spring.springbootstarter.Student;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int id;
	private String name;
	private int score;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	public Student(){
		
	}
	
	public Student(int id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}

}
