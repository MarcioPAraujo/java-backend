package edu.marcio.parking_control.service;



import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
        
        return parkingSpotRepository.existsByLicensePlateNumber(licensePlateNumber);
    }

    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        
        return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
    }

    public boolean existsByApartmentAndBlock(String apartment, String block) {
        
       return parkingSpotRepository.existsByApartmentAndBlock(apartment, block);
    }

    public Page<ParkingSpotModel> findAll(Pageable pageable){
        return parkingSpotRepository.findAll(pageable);
    }

    public Optional<ParkingSpotModel> findById(UUID id){
        return parkingSpotRepository.findById(id);
    }

    @Transactional
    public void deleteParkingSpot(UUID id){
        parkingSpotRepository.deleteById(id);
    }
}

