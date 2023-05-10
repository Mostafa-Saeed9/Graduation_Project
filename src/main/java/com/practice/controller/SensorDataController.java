package com.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.entity.SensorData;
import com.practice.repository.SensorDataRepository;

@RestController
@RequestMapping("/api")
public class SensorDataController {

	@Autowired
	private SensorDataRepository sensorDataRepository;

	@PostMapping("/sensordata")
	public ResponseEntity<?> createSensorData(@RequestBody SensorData sensorData) {
		sensorDataRepository.save(sensorData);
		return ResponseEntity.ok().build();
	}

	@GetMapping("/sensordata")
	public List<SensorData> getAllSensorData() {
		return sensorDataRepository.findAll();
	}

}
