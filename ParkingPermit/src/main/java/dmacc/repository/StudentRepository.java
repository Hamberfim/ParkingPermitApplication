package dmacc.repository;

import org.springframework.data.repository.CrudRepository;

import dmacc.beans.Student;

//use Spring repo CRUD
public interface StudentRepository extends CrudRepository<Student, Long>{
	
	Student findById(long id);

}
