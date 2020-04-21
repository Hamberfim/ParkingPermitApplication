package dmacc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dmacc.beans.Student;

//use Spring repo CRUD
@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Student, Long>{
	
	//Student findById(long id);
	
	@Override
	List<Student> findAll();

}
