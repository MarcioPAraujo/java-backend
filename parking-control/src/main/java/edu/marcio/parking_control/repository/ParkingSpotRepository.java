package edu.marcio.parking_control.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.marcio.parking_control.model.ParkingSpotModel;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel,UUID>{

    boolean existsByLicensePlateNumber(String licensePlateNumber);

    boolean existsByParkingSpotNumber (String ParkingSpotNumber);

    public boolean existsByApartmentAndBlock(String apartment, String block);
    
}
