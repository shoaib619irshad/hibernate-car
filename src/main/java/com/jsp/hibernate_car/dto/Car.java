package com.jsp.hibernate_car.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
	@Id
	private int carId;
	private String carEngineType;
	private int carStrokes;
	private double carPrice;
	

}
