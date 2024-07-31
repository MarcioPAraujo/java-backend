package edu.marcio.parking_control.controller;

import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.marcio.parking_control.dto.ParkingSpotDto;
import edu.marcio.parking_control.model.ParkingSpotModel;
import edu.marcio.parking_control.service.ParkingSpotService;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/parking-spot")
public class ParkingSpotController {
    @Autowired
    private ParkingSpotService parkingSpotService;


    @PostMapping
    public ResponseEntity<Object> saveParkingSpot(@RequestBody @Valid ParkingSpotDto parkingSpotDto) {
        
        boolean licensePlateAlreadyInUse = parkingSpotService.existsByLicensePlateNumber(parkingSpotDto.getLicensePlateNumber());
        if(licensePlateAlreadyInUse){
            return  ResponseEntity.status(HttpStatus.CONFLICT).body("this plante number is already registered");
        }

        boolean parkingSpotOccupied = parkingSpotService.existsByParkingSpotNumber(parkingSpotDto.getParkingSpotNumber());
        if(parkingSpotOccupied){
            return  ResponseEntity.status(HttpStatus.CONFLICT).body("this parkisng spot is already in use");
        }

        boolean parkingSpotRegisteredInOtherApartmentblock = parkingSpotService.existsByApartmentAndBlock(parkingSpotDto.getApartment(), parkingSpotDto.getBlock());
        if (parkingSpotRegisteredInOtherApartmentblock) {
            return  ResponseEntity.status(HttpStatus.CONFLICT).body("this apartment and block already have the vancancy occupied");
        }



        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        BeanUtils.copyProperties(parkingSpotDto, parkingSpotModel);
        parkingSpotModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status( HttpStatus.CREATED).body(parkingSpotService.save(parkingSpotModel));
    
    }
    
}
