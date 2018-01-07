package com.decorator.test;

public class Espresso extends Beverage {

	public Espresso() {
		super("Espresso");
	}
	
	@Override
	double cost() {
		return 1.99;
	}

}
