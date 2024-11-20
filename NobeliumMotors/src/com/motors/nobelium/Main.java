package com.motors.nobelium;

import com.motors.nobelium.bikes.Bike;
import com.motors.nobelium.cars.Car;

public class Main {

	public static void main(String[] args) {
		
		MotorsDealership dealership = new MotorsDealership("Exorticars", "51 Non-Existance Rd", "Exorticar City");
		
		//Automobile automobile = new Automobile() //cannot instantiate an abstract class
		
		Car myCar = new Car("Renault", "Clio V", 2022, "Red", 5);
		Bike myBike = new Bike("Susuki", "brad", 2022, "Red");
		
		Car[] car = new Car[50];
		
		car[0] = new Car("Renault", "Clio V", 2022, "Red", 5);
		car[1] = new Car("Renault", "Clio V", 2020, "Blue", 5);
		car[2] = new Car("Renault", "Clio IV", 2018, "Red", 5);
		car[3] = new Car("Toyota", "Yaris T3", 2016, "Gray", 5);
		car[4] = new Car("Tesla", "Model S S", 2019, "White", 5);
		car[5] = new Car("Ford", "Focus ST", 2019, "Red", 5);
		car[6] = new Car("Tesla", "Model V", 2021, "Blue", 5);
		car[7] = new Car("Honda", "Civic", 2011, "Red", 5);
		car[8] = new Car("Toyota", "Corolla", 1997, "Black", 5);
		
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
		
		
		System.out.println("Creating the employees below ");

		SalesReps employee1 = new SalesReps("James Powell", "EMP1234", 0);
		SalesReps employee2 = new SalesReps("Johan Lesley", "EMP2345", 0);
		SalesReps employee3 = new SalesReps("Marianne Joules", "EMP3456", 0);
		SalesReps employee4 = new SalesReps("Karen Jones", "EMP4567", 0);
		SalesReps employee5 = new SalesReps("Pablo Juarez", "EMP5678", 0);
		SalesReps employee6 = new SalesReps("Daisy Yann", "EMP6789", 0);
		
		System.out.println();
		
		System.out.println("Adding the employees below ");
		
		dealership.addSalesEmployee(employee1);
		dealership.addSalesEmployee(employee2);
		dealership.addSalesEmployee(employee3);
		dealership.addSalesEmployee(employee4);
		dealership.addSalesEmployee(employee5);
		dealership.addSalesEmployee(employee6);
		
		System.out.println();
		
		System.out.println(dealership.getDealershipName() + " has " + dealership.getSalesPerson().size() + " sales employees ");
		
		System.out.println();
		
		System.out.println(employee6.getSalesCount());
		
		dealership.sellItem(myBike, employee6);
		dealership.sellItem(bike[1], employee6);
		dealership.sellItem(bike[3], employee6);
		dealership.sellItem(car[2], employee5);
		System.out.println(employee6.getSalesCount());
		
		System.out.println();
		
		System.out.println(dealership.getDealershipName() + " has " + dealership.getInventory().size() + " automobiles for sale");

		System.out.println();
		
		dealership.displaySalesData();
	
	}

}
