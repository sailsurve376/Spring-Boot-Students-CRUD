package org.jso.spring_boot_students_crud_app.repository;

import java.util.List;

import org.jso.spring_boot_students_crud_app.dto.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Students_Repository extends JpaRepository<Students, Integer> {
	

}
