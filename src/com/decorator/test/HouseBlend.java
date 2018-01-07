package com.decorator.test;

public class HouseBlend extends Beverage {

	public HouseBlend(){
		super("House Blend");
	}
	
	@Override
	double cost() {
		return 0.89;
	}

}
