package com.sangamone.dao;

import java.util.List;

import com.sangamone.Entity.Student;

public interface StudentDao {

	List<Student> getAll();

	List<Student> getStudent(int studentId);

	

}
