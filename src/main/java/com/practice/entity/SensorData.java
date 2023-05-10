package com.practice.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SensorData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private Double gasConcentration;

	@Column(nullable = false)
	private LocalDateTime dateTime;

	@Column(nullable = false)
	private String deviceId;

	public Double getGasConcentration() {
		return gasConcentration;
	}

	public void setGasConcentration(Double gasConcentration) {
		this.gasConcentration = gasConcentration;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

}
