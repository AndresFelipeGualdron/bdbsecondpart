package bdb.controller;

import bdb.model.Location;
import bdb.services.AplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/locations")
public class ProyectController {

    @Autowired
    private AplicationService aplicationService;

    @GetMapping("")
    public ResponseEntity<?> getLocations(){
        return new ResponseEntity<>(this.aplicationService.getLocations(), HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<?> getLocation(@PathVariable String name){
        return new ResponseEntity<>(this.aplicationService.getLocation(name), HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<?> putLocation(@RequestBody Location location){
        return new ResponseEntity<>(this.aplicationService.setLocation(location),HttpStatus.ACCEPTED);
    }

    @PostMapping("")
    public ResponseEntity<?> postLocation(@RequestBody Location location){
        return new ResponseEntity<>(this.aplicationService.saveLocation(location), HttpStatus.ACCEPTED);
    }

}
