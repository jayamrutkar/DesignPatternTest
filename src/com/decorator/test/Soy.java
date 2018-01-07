package com.decorator.test;

public class Soy extends CandimentDecorator {

	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage= beverage;
	}

	@Override
	String getDescription() {
		return beverage.getDescription()+", Soy";
	}
	
	@Override
	double cost() {
		return beverage.cost()+0.20;
	}

}
