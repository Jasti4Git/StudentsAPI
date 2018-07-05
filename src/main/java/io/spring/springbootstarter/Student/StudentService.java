package io.spring.springbootstarter.Student;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

	private List<Student> StudentList = Arrays.asList(new Student("Sreemanth", 1, 90), new Student("Arun", 2, 65),
			new Student("Prakash", 3, 89));

	public List<Student> getAllStudents() {

		return StudentList;

	}

	public Student getStudent(int id) {

		for (Student s : StudentList) {
			if (id == s.getID())
				return s;
		}
		return null;

	}

}