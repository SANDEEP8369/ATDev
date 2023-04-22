package com.RestAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.RestAPI.Repository.StudentRepos;
import com.RestAPI.entity.Student;

@Component
public class StudentService {
	
	@Autowired
	private StudentRepos repos;
	
	// get all student 
	public List<Student> getAll(){
		
		return this.repos.findAll();
	}
	
	
	// add student
	
	public Student addStudent(Student stu) {
		repos.save(stu);
		return stu;
	}
	
	//update student
	
	public Student UpdateStudent(Student stu) {
		repos.save(stu);
		return stu;
	}
	
	//Delete Student
	
	public void deletStudent(int id) {
		
			repos.deleteById(id);
		
		}
	

}
