package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dmacc.beans.Vehicle;

public interface VehicleDAO extends JpaRepository<Vehicle, Long>{

}
