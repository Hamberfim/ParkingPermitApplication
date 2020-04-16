package dmacc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dmacc.beans.Student;
import dmacc.beans.Vehicle;
import dmacc.repository.StudentRepository;
import dmacc.repository.VehicleRepository;

@SpringBootApplication
public class ParkingPermitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingPermitApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner mappingRepos(StudentRepository studentRepository, VehicleRepository vehicleRepository) {
		return args -> {
			
			//create new student
			Student student = new Student("Larry", "Boladaire", null);
			//save the student
			studentRepository.save(student);
			
			//create and save new vehicles
			vehicleRepository.save(new Vehicle("Ford", "Escort", "Blue", "KRT177", student));
			
		};
		
	}

}
