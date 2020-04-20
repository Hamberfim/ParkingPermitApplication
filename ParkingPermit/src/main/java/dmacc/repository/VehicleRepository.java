package dmacc.repository;

import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Student;
import dmacc.beans.Vehicle;


//use Spring repo CRUD
@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, Long>{
	
	List<Vehicle> findByStudent(Student student, Sort sort);
	
	@Override
	List<Vehicle> findAll();

}
