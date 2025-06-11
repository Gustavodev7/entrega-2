package com.backend.sprint2.repository;

import com.backend.sprint2.model.Reading;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReadingRepository extends JpaRepository<Reading, Long> {
    List<Reading> findBySensorId(String sensorId);
}