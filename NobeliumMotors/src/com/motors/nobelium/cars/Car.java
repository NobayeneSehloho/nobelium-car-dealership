package com.motors.nobelium.cars;

import com.motors.nobelium.Automobile;
import com.motors.nobelium.Dealership;
import com.motors.nobelium.bikes.Bike;

public class Car extends Automobile implements Dealership {
	
	
	protected int seatingCapacity;

	public Car( String make, String model,
			int year, String color, int seatingCapacity) {
		super(make, model, year, color);
		
		this.seatingCapacity = seatingCapacity;
	}
	
	
	
	public int getSeatingCapacity() {
		return seatingCapacity;
	}


	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}


	@Override
	public void addCar(Car car) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCar(Car car) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addBike(Bike bike) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeBike(Bike bike) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayInventory() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void addAutomobile(Automobile automobile) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void removeAutomobile(Automobile automobile) {
		// TODO Auto-generated method stub
		
	}


	
	
    


}
