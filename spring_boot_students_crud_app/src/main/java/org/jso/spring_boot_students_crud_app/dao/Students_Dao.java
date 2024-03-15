package org.jso.spring_boot_students_crud_app.dao;

import java.util.List;
import java.util.Optional;

import org.jso.spring_boot_students_crud_app.dto.Students;
import org.jso.spring_boot_students_crud_app.repository.Students_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository 
public class Students_Dao {
	@Autowired
	private Students_Repository repository;
	
	public void saveStudent(Students student) {
		repository.save(student);
	}
	
	public void updateStudent(Students student) {
		repository.save(student);
	}
	public Optional<Students> fetchStudentById(int id) {
		return repository.findById(id);
	}
	public List<Students> fetchAllStudents(){
		return repository.findAll();
	}
	public void deleteStudentById(int id) {
		repository.deleteById(id);
	}

}
