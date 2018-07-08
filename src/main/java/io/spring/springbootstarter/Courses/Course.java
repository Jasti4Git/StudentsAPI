package io.spring.springbootstarter.Courses;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.spring.springbootstarter.Student.Student;

@Entity
public class Course {

	@Id
	private int id;
	private String name;
	private int cost;
	
	@ManyToOne
	private Student student;

	public int getId() {
		return id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
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

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}



}
