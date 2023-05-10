package com.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.entity.SensorData;

public interface SensorDataRepository extends JpaRepository<SensorData, Long> {

}
