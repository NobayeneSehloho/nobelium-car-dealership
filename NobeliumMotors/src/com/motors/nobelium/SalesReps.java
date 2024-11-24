package com.motors.nobelium;

import java.util.ArrayList;
import java.util.List;

public class SalesReps {
	
	private String employeeName;
	private String employeeID;
	private int salesCount = 0;
	private List<Automobile> sales;
	
	
	
	public SalesReps(String employeeName, String employeeID, int salesCount) {
		super();
		this.employeeName = employeeName;
		this.employeeID = employeeID;
		this.salesCount = salesCount;
		this.sales = new ArrayList<>();
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getEmployeeID() {
		return employeeID;
	}


	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}


	public int getSalesCount() {
		return salesCount;
	}


	public void setSalesCount(int salesCount) {
		this.salesCount = salesCount;
	}


	public List<Automobile> getSales() {
		return sales;
	}


	public void setSales(List<Automobile> sales) {
		this.sales = sales;
	}
	
	
	public void sellAutomobile(Automobile automobile) {
		
        sales.add(automobile);
    
	}


	@Override
	public String toString() {
		return "SalesReps [employeeName=" + employeeName + ", employeeID=" + employeeID + ", salesCount=" + salesCount
				+ ", sales=" + sales + "]";
	}
	
	
	
	
}
