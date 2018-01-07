package com.decorator.test;

public class Whip extends CandimentDecorator {

	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage=beverage;
	}

	@Override
	String getDescription() {
		return beverage.getDescription()+", Whip";
	}
	
	@Override
	double cost() {
		return beverage.cost()+0.25;
	}

}
