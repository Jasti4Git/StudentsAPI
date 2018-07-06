package io.spring.springbootstarter.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

	private static List<Student> StudentList = new ArrayList<>();
	
	
	public List<Student> getAllStudents() {

		return StudentList;

	}

	public Student getStudent(int id) {

		for (Student s : StudentList) {
			if (id == s.getId())
				return s;
		}
		return null;

	}

	public void addStudents(Student student) {
		StudentList.add(student);
		
	}

}
