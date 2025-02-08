package cn.gcsp.constrain.controller;


import cn.gcsp.constrain.dto.ProvinceCityDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/locations")
public class LocationController {

    @PostMapping
    public ResponseEntity<String> addLocation(@RequestBody @Valid ProvinceCityDTO dto) {
        // Do
        return ResponseEntity.status(HttpStatus.CREATED).body("done");
    }
}