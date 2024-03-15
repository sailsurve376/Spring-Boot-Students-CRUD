package org.jso.spring_boot_students_crud_app.service;

import java.util.List;
import java.util.Optional;

import org.jso.spring_boot_students_crud_app.dao.Students_Dao;
import org.jso.spring_boot_students_crud_app.dto.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Students_Service {
	@Autowired
	private Students_Dao dao;
	
	public void saveStudent(Students student) {
		dao.saveStudent(student);
	}
	
	public void updateStudent(Students student) {
		dao.updateStudent(student);
	}
	
	public Optional<Students> fetchStudentById(int id) {
		return dao.fetchStudentById(id);
	}
	public List<Students> fetchAllStudents(){
		return dao.fetchAllStudents();
	}
	public void deleteStudentById(int id) {
		dao.deleteStudentById(id);
	}

}
