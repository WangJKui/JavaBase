package com.wjk.java.base.head.first.wrapper;

public abstract class Beverage {

	String description = "Unknown Beverage" ;
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
