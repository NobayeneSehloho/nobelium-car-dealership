package com.motors.nobelium;


import java.util.ArrayList;
import java.util.List;


public  class MotorsDealership  {
	
	private String dealershipName;
	private String dealershipAddress;
	private String dealershipCity;
	
	private List<Automobile> inventory = new ArrayList<>();
	

	public MotorsDealership(String dealershipName, String dealershipAddress, String dealershipCity) {
		this.dealershipName = dealershipName;
		this.dealershipAddress = dealershipAddress;
		this.dealershipCity = dealershipCity;
		
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
	
	
    void removeItem(Automobile item) {
    	inventory.remove(item );
        System.out.println(item + " removed from inventory.");

    }
    
    
    void displayDealershipInventory() {
    	
    	for (Automobile item : inventory) {
    		System.out.println("Our inventory :");
    		System.out.println(item);
    	}
    	
    	
    }

	
	
}
