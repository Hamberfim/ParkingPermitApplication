package dmacc.repository;

import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import dmacc.beans.Student;
import dmacc.beans.Vehicle;


//use Spring repo CRUD
public interface VehicleRepository extends CrudRepository<Vehicle, Long>{
	
	List<Vehicle> findByStudent(Student student, Sort sort);

}
