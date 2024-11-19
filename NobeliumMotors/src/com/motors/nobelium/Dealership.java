package com.motors.nobelium;

import com.motors.nobelium.bikes.Bike;
import com.motors.nobelium.cars.Car;

public interface Dealership {
	
	void addCar(Car car);
    void removeCar(Car car);
    
    void addBike(Bike bike);
    void removeBike(Bike bike);
    
    void displayInventory();
    
    
    void addAutomobile(Automobile automobile);
    void removeAutomobile(Automobile automobile);
    

    
}
