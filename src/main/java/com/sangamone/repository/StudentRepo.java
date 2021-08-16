package com.sangamone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.sangamone.Entity.Student;

public interface StudentRepo extends CrudRepository<Student, String> {
	//@Query(value = "select * from studentdata ",  nativeQuery = true)

    public List<Student> findAll();
	@Query(value = "select * from studentdata where student_id=?1",  nativeQuery = true)

	public List<Student> getStudentById(int studentId);


}
