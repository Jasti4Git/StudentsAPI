package io.spring.springbootstarter.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentrepository;

	List<Student> StudentList;

	public List<Student> getAllStudents() {

		StudentList = new ArrayList<>();
		studentrepository.findAll().forEach(s->StudentList.add(s));
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
		studentrepository.save(student);

	}

	public void updateStudents(Student student, int id) {

		studentrepository.save(student);

	}

	public void deleteStudent(int id) {

		studentrepository.delete(id);
	}

}
