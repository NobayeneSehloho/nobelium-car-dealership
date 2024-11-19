package com.motors.nobelium;

import com.motors.nobelium.bikes.Bike;
import com.motors.nobelium.cars.Car;

public class Main {

	public static void main(String[] args) {
		
		MotorsDealership dealership = new MotorsDealership("ExortiCars", "51 Non-Existance Rd", "Exorticar City");
		
		//Automobile automobile = new Automobile() //cannot instantiate an abstract class
		
		Car myCar = new Car("Renault", "Clio V", 2022, "Red", 5);
		Bike myBike = new Bike("Susuki", "brad", 2022, "Red");
		
		Car[] car = new Car[50];
		
		car[0] = new Car("Renault", "Clio V", 2022, "Red", 5);
		car[1] = new Car("Renault", "Clio V", 2020, "Blue", 5);
		car[2] = new Car("Renault", "Clio IV", 2018, "Red", 5);
		car[3] = new Car("Renault", "Clio V", 2022, "White", 5);
		car[4] = new Car("Renault", "Clio V", 2022, "Red", 5);
		
		Bike[] bike = new Bike[50];
	
		bike[0] = new Bike("Susuki", "brad", 2022, "Red");
		bike[1] = new Bike("Susuki", "brad", 2022, "Red");
		bike[2] = new Bike("Susuki", "brad", 2022, "Red");
		bike[3] = new Bike("Susuki", "brad", 2022, "Red");
		bike[4] = new Bike("Susuki", "brad", 2022, "Red");
		
		System.out.println();
		
		dealership.addItem(myCar);
		dealership.addItem(car[0]);
		dealership.addItem(bike[1]);
		dealership.addItem(car[2]);
		dealership.addItem(car[3]);
		dealership.addItem(car[4]);
	
		System.out.println();
		
		dealership.addItem(myBike);
		dealership.addItem(bike[0]);
		dealership.addItem(car[1]);
		dealership.addItem(bike[2]);
		dealership.addItem(bike[3]);
		dealership.addItem(bike[4]);
		
		System.out.println();
		System.out.println(dealership.getDealershipName() + " has " + dealership.getInventory().size() + " automobiles for sale");
		
		System.out.println();
		dealership.displayDealershipInventory();
		
		

	}

}
