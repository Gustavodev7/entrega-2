package com.backend.sprint2.controller;

import com.backend.sprint2.model.Reading;
import com.backend.sprint2.repository.ReadingRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/readings")
@CrossOrigin
public class ReadingController {

    private final ReadingRepository repository;

    public ReadingController(ReadingRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Reading saveReading(@RequestBody Reading reading) {
        return repository.save(reading);
    }

    @GetMapping
    public List<Reading> getAllReadings() {
        return repository.findAll();
    }

    @GetMapping("/{sensorId}")
    public List<Reading> getBySensorId(@PathVariable String sensorId) {
        return repository.findBySensorId(sensorId);
    }
}