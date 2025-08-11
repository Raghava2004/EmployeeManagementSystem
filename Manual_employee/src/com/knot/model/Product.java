package com.knot.model;

public class Product {
	private Integer ID;
	private String Name;
	private Integer DOE;
	
	@Override
	public String toString() {
		return "Product [ID=" + ID + ", Name=" + Name + ", DOE=" + DOE + "]";
	}

	public Product(Integer iD, String name, Integer dOE) {
		super();
		ID = iD;
		Name = name;
		DOE = dOE;
	}
	
		
}
