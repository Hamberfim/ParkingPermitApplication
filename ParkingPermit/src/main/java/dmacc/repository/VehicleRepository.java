package dmacc.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dmacc.beans.Student;
import dmacc.beans.Vehicle;


//use Spring repo CRUD
@Repository
@Transactional
public interface VehicleRepository extends JpaRepository<Vehicle, Long>{
	
	
	List<Vehicle> findByStudent(Student student, Sort sort);
	
	@Override
	List<Vehicle> findAll();
	
	

}
