package io.spring.springbootstarter.Courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	CourseRepository Courserepository;

	List<Course> CourseList;

	public List<Course> getAllCourses(int id) {

		CourseList = new ArrayList<>();
		Courserepository.findByStudentId(id).forEach(s->CourseList.add(s));
				return CourseList;

	}

	public Course getCourse(int id) {

		for (Course c : CourseList) {
			if (id == c.getId())
				return c;
		}
		return null;

	}

	public void addCourse(Course course) {
		Courserepository.save(course);

	}

	public void updateCourse(Course course, int id) {

		Courserepository.save(course);

	}

	public void deleteCourse(int id) {

		Courserepository.delete(id);
	}

}
