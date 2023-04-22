package com.RestAPI.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.RestAPI.entity.Student;
import com.RestAPI.service.StudentService;

@Controller
public class RestController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/home")
	public ResponseEntity<List<Student>> getStudent() {
		
		List<Student> list=service.getAll();
		if(list.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
					
		}
		
		return ResponseEntity.status(HttpStatus.CREATED).body(list);
	
	
	}
	@PostMapping("/home")
	public ResponseEntity<Student> addStudent(@RequestBody Student stu) {
		Student st=null;
		try {
			st=service.addStudent(stu);
			return ResponseEntity.of(Optional.of(st));
			
		} catch (Exception e) {
		e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); 
		}
		
		
	}
	
	@PutMapping("/home")
	public ResponseEntity<Student> updateStudent(@RequestBody Student stu ) {
		try {
			this.service.UpdateStudent(stu);
			return ResponseEntity.ok().body(stu);
		} catch (Exception e) {
			e.printStackTrace();
			return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	@DeleteMapping("/home/{id}")
	public ResponseEntity<Void> deleteStudent(@PathVariable("id") int   id ) {
		
		try {
			this.service.deletStudent(id);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
