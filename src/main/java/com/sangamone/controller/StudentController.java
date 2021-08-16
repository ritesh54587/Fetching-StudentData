package com.sangamone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sangamone.Entity.Student;
import com.sangamone.dao.StudentDao;



@Controller
public class StudentController {
	@Autowired
	StudentDao studentdao ;
	
	
	
	@RequestMapping("/home")
	public String Home() {
		return "index.jsp";
}
	@RequestMapping(value="/Students")
	@ResponseBody
	List <Student> getAllStudents(){
		List<Student> list = studentdao.getAll();
		return list;
		
	}
	@RequestMapping(value = "/test")
	@ResponseBody
	public List<Student> getStudent(@RequestParam int studentId) {
		List<Student> list = null;
		list = studentdao.getStudent(studentId);
		return list;
	}
}