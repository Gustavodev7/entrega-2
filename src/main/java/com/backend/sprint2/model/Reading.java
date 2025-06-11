package com.backend.sprint2.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Reading {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sensorId;
    private Double readingValue;
    private LocalDateTime timestamp;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getSensorId() { return sensorId; }
    public void setSensorId(String sensorId) { this.sensorId = sensorId; }

    public Double getReadingValue() { return readingValue; }
    public void setReadingValue(Double readingValue) { this.readingValue = readingValue; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
}