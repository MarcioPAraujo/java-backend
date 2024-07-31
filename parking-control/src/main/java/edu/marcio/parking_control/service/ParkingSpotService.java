package edu.marcio.parking_control.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.marcio.parking_control.model.ParkingSpotModel;
import edu.marcio.parking_control.repository.ParkingSpotRepository;
import jakarta.transaction.Transactional;

@Service
public class ParkingSpotService {
    
    @Autowired
    private ParkingSpotRepository parkingSpotRepository;

    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel){

        return parkingSpotRepository.save(parkingSpotModel);

    }

    public boolean existsByLicensePlateNumber(String licensePlateNumber) {
        // TODO Auto-generated method stub
        return parkingSpotRepository.existsByLicensePlateNumber(licensePlateNumber);
    }

    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        // TODO Auto-generated method stub
        return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
    }

    public boolean existsByApartmentAndBlock(String apartment, String block) {
        // TODO Auto-generated method stub
       return parkingSpotRepository.existsByApartmentAndBlock(apartment, block);
    }
}
