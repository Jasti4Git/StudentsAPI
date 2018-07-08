package io.spring.springbootstarter.Student;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
