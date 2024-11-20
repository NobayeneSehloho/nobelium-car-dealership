package com.motors.nobelium;

import java.util.ArrayList;
import java.util.List;


public  class MotorsDealership  {
	
	private String dealershipName;
	private String dealershipAddress;
	private String dealershipCity;
	
	private List<Automobile> inventory = new ArrayList<>();
	private List<SalesReps> salesPerson = new ArrayList<>();
	//private List<ArrayList<Automobile>> salesData = new ArrayList<>(); // // Create a multi-dimensional ArrayList
	
	
	public MotorsDealership(String dealershipName, String dealershipAddress, String dealershipCity) {
		this.dealershipName = dealershipName;
		this.dealershipAddress = dealershipAddress;
		this.dealershipCity = dealershipCity;
	}
	
	
	public List<SalesReps> getSalesPerson() {
		return salesPerson;
	}


	public void setSalesPerson(List<SalesReps> salesPerson) {
		this.salesPerson = salesPerson;
	}

	public String getDealershipName() {
		return dealershipName;
	}

	public void setDealershipName(String dealershipName) {
		this.dealershipName = dealershipName;
	}

	public String getDealershipAddress() {
		return dealershipAddress;
	}

	
	public void setDealershipAddress(String dealershipAddress) {
		this.dealershipAddress = dealershipAddress;
	}

	
	public String getDealershipCity() {
		return dealershipCity;
	}

	public void setDealershipCity(String dealershipCity) {
		this.dealershipCity = dealershipCity;
	}

	public List<Automobile> getInventory() {
		return inventory;
	}

	public void setInventory(List<Automobile> inventory) {
		this.inventory = inventory;
	}


	
	void addItem(Automobile item) {
		inventory.add(item );
		System.out.println(item.getMake() + " " + item.getModel() + " added to inventory.");
	}
	
	
    void sellItem(Automobile item, SalesReps employee) {
    	
    	employee.sellAutomobile(item);
    	employee.setSalesCount(employee.getSalesCount() + 1);
    	inventory.remove(item );
    	
        System.out.println(item + " sold from inventory by " + employee.getEmployeeName());

    }
    
    
    void addSalesEmployee(SalesReps employee) {
    	
    	salesPerson.add(employee);
    	System.out.println(employee.getEmployeeName() + " added to Dealdership ");
    }
    
    
    
    void displayDealershipInventory() {
    	
    	System.out.println(getDealershipName() + " Inventory: ");
    	for (Automobile item : inventory) {
    		System.out.println(item);
    	}
    	
    }
    
    public void displaySalesData() {
        System.out.println("Sales Data:");
        for (SalesReps salesRep : salesPerson) {
            System.out.println("Salesperson: " + salesRep.getEmployeeName());
            System.out.println("Sold Cars: " + salesRep.getSales());
            System.out.println();
        }
    }

	
	
}
