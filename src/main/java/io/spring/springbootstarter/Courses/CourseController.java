package io.spring.springbootstarter.Courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.spring.springbootstarter.Student.Student;

@RestController
public class CourseController {

	@Autowired
	CourseService courseServiceInstance;

	@RequestMapping("/students/{StudentID}/courses")
	public List<Course> getAllCourses(@PathVariable int StudentID) {

		return courseServiceInstance.getAllCourses(StudentID);
	}

	@RequestMapping("/students/{StudentID}/courses/{courseID}")
	public Course getCourse(@PathVariable int courseID) {

		return courseServiceInstance.getCourse(courseID);
	}
  
	@RequestMapping(method = RequestMethod.POST, value = "/students/{StudentID}/courses")
	public void addCourse(@RequestBody Course course,@PathVariable int StudentID) {

		course.setStudent(new Student(StudentID,"",0));
		courseServiceInstance.addCourse(course);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/students/{StudentID}/courses/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable int id,@PathVariable int StudentID ) {
		course.setStudent(new Student(StudentID,"",0));
		courseServiceInstance.updateCourse(course, id);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/students/{StudentID}/courses/{id}")
	public void deleteCourse(@PathVariable int id) {

		courseServiceInstance.deleteCourse(id);
	}

}
