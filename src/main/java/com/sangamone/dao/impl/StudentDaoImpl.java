package com.sangamone.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangamone.Entity.Student;
import com.sangamone.dao.StudentDao;
import com.sangamone.repository.StudentRepo;
@Service
@Transactional
public class StudentDaoImpl implements StudentDao {
	@Autowired
	StudentRepo studentrepo;
	
	
	@Override
	public List<Student> getAll() {
		List <Student> list=  studentrepo.findAll();
		return list;
	}
	@Override
	public List<Student> getStudent(int studentId){
		List <Student> list=  studentrepo.getStudentById(studentId);
		return list;
	}


}
