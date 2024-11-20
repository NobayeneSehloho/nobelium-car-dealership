package com.motors.nobelium;

import java.util.ArrayList;
import java.util.List;

import com.motors.nobelium.bikes.Bike;
import com.motors.nobelium.cars.Car;

public abstract class Automobile  {
	
	
	protected String make;
    protected String model;
    protected int year;
    protected String color;
    protected String salesRep;
    
    protected List<Car> carInventory = new ArrayList<>();
	protected List<Bike> bikeInventory = new ArrayList<>();
    

	public Automobile(String make, String model, int year, String color) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		
	}

	public String getSalesRep() {
		return salesRep;
	}

	public void setSalesRep(String salesRep) {
		this.salesRep = salesRep;
	}

	public Automobile() {
		super();
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public List<Car> getCarInventory() {
		return carInventory;
	}

	public void setCarInventory(List<Car> carInventory) {
		this.carInventory = carInventory;
	}

	public List<Bike> getBikeInventory() {
		return bikeInventory;
	}

	public void setBikeInventory(List<Bike> bikeInventory) {
		this.bikeInventory = bikeInventory;
	}


	
	
	

	
    
    
	
}
