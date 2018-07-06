package io.spring.springbootstarter.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

	@RequestMapping(method = RequestMethod.POST, value = "/students")
	public void addStudent(@RequestBody Student student) {

		studentServiceInstance.addStudents(student);

	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/students/{id}")
	public void updateStudent(@RequestBody Student student, @PathVariable int id){
		
		studentServiceInstance.updateStudents(student, id);
	}
	

}
