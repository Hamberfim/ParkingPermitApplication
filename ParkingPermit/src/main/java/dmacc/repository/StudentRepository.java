package dmacc.repository;

import org.springframework.data.repository.CrudRepository;

import dmacc.beans.Student;

public interface StudentRepository extends CrudRepository<Student, Long>{
	
	Student findById(long id);

}
