package edu.marcio.parking_control.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.marcio.parking_control.model.ParkingSpotModel;
import edu.marcio.parking_control.repository.ParkingSpotRepository;

@Service
public class ParkingSpotService {
    
    @Autowired
    private ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel){

        return parkingSpotRepository.save(parkingSpotModel);

    }
}
