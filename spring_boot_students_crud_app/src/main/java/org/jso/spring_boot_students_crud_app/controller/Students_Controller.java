package org.jso.spring_boot_students_crud_app.controller;

import java.util.List;
import java.util.Optional;

import org.jso.spring_boot_students_crud_app.dto.Students;
import org.jso.spring_boot_students_crud_app.service.Students_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Students_Controller {
	@Autowired
	private Students_Service service;
	
	@PostMapping("/students/save")
	public void saveStudent(@RequestBody Students student) {
		service.saveStudent(student);
	}
	
	@PutMapping("/students/update")
	public void updateStudent(@RequestBody Students student) {
		service.updateStudent(student);
	}
	
	@GetMapping("/students/fetch/{id}")
	public Optional<Students> fetchStudentById(@PathVariable int id) {
		return service.fetchStudentById(id);
	}
	
	@GetMapping("/students/fetchAll")
	public List<Students> fetchAllStudents(){
		return service.fetchAllStudents();
	}
	
	@DeleteMapping("/students/delete")
	public void deleteStudentById(@RequestParam int id)
	{
		service.deleteStudentById(id);
	}

}
