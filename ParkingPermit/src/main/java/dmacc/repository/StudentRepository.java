package dmacc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Student;

//use Spring repo CRUD
@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{
	
	//Student findById(long id);
	
	@Override
	List<Student> findAll();

}
