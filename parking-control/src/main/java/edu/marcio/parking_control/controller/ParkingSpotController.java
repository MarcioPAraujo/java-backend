package edu.marcio.parking_control.controller;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.marcio.parking_control.dto.ParkingSpotDto;
import edu.marcio.parking_control.model.ParkingSpotModel;
import edu.marcio.parking_control.service.ParkingSpotService;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



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
    @GetMapping
    public ResponseEntity<List<ParkingSpotModel>> getAllParkingSpots() {
        return ResponseEntity.status(HttpStatus.OK).body(parkingSpotService.findAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Object> getParkingSpotBYId(@PathVariable(value = "id") UUID id) {
        Optional<ParkingSpotModel> parkingSpotOptional = parkingSpotService.findById(id);
        if(!parkingSpotOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("there's no parking spot");
        }
        return ResponseEntity.status(HttpStatus.OK).body(parkingSpotOptional.get());

        
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> deleteParkingSpot(@PathVariable(value = "id") UUID id){
        Optional<ParkingSpotModel> parkingSpotOptional = parkingSpotService.findById(id);
        if (parkingSpotOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("this parking spot doesn't exits");
        }

        parkingSpotService.deleteParkingSpot(id);
        return ResponseEntity.status(HttpStatus.OK).body("Mr."+parkingSpotOptional.get().getResponsibleName()+" you're no longer part of the coninental");


    }
    

    
}
