package io.spring.springbootstarter.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	StudentService studentServiceInstance;

	@RequestMapping("/students")
	public List<Student> getAllStudents() {

		return studentServiceInstance.getAllStudents();
	}
	
	
	
	@RequestMapping("/students/{id}")
	public Student getStudent(@PathVariable int id) {

		return studentServiceInstance.getStudent(id);
	}

}
