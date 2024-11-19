package com.motors.nobelium;

import com.motors.nobelium.bikes.Bike;
import com.motors.nobelium.cars.Car;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MotorsDealership dealership = new MotorsDealership("ExortiCars", "51 Non-Existance Rd", "Exorticar City");
		
		//Automobile automobile = new Automobile() //cannot instantiate an abstract class
		
		Car mycar = new Car("Renault", "Clio V", 2022, "Red", 5);
		Bike myBike = new Bike("Susuki", "brad", 2022, "Red");
		
		
		dealership.addItem(mycar);
		dealership.addItem(myBike);
		
		System.out.println(dealership.getDealershipName() + " has " + dealership.getInventory().size());
		
		

	}

}
