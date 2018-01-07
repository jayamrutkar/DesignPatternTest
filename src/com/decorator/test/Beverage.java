package com.decorator.test;

public abstract class Beverage {
	
	String description;

	public Beverage() {
	}
	
	public Beverage(String desc) {
		this.description = desc;
	}
	
	String getDescription(){
		return description;
	}
	
	abstract double cost();

}
