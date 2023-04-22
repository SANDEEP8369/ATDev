package com.RestAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RestAPI.entity.Student;

@Repository
public interface StudentRepos  extends JpaRepository<Student, Integer>{

	
	public Student findById(int id);
	

}