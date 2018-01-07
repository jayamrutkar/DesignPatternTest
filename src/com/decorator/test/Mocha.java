package com.decorator.test;

public class Mocha extends CandimentDecorator {

	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage= beverage;
	}

	@Override
	String getDescription() {
		return beverage.getDescription()+", Mocha";
	}
	
	@Override
	double cost() {
		return beverage.cost()+0.10;
	}

}
