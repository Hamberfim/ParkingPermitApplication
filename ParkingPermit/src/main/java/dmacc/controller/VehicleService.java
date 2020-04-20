package dmacc.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import dmacc.beans.Student;
import dmacc.beans.Vehicle;
import dmacc.repository.StudentDAO;
import dmacc.repository.VehicleDAO;

public class VehicleService {
	
	@Autowired
	VehicleDAO vehicleDao;
	
	@Autowired
	StudentDAO studentDao;
	
	public List<Vehicle> getAllVehicles() {
		return vehicleDao.findAll();
		
	}
	
	public Optional<Vehicle> getVehicleById(Long id) throws Exception {
        if (!vehicleDao.existsById(id)) {
            throw new Exception("Vehicle with id " + id + " not found");
        }
        return vehicleDao.findById(id);
    }
	
	public Vehicle createVehicle(long studentid, Vehicle vehicle) throws Exception {
		Set<Vehicle> vehicles = new HashSet<>();
		Student student1 = new Student();
		
		Optional<Student> byId = studentDao.findById(studentid);
		if (!byId.isPresent()) {
            throw new Exception("Student with id " + studentid + " does not exist");
        }
        Student student = byId.get();
        
        vehicle.setStudent(student);
        
        Vehicle vehicle1 = vehicleDao.save(vehicle);
        //link Vehicle to Student
        vehicles.add(vehicle1);
        student1.setVehicle(vehicles);
		
		return vehicle1;
		
	}

}
