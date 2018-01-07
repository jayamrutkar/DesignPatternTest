package com.decorator.test;

public class DardRoast extends Beverage {

	public DardRoast() {
		// TODO Auto-generated constructor stub
		super("Dark Roast");
	}

	public DardRoast(String desc) {
		super(desc);
		// TODO Auto-generated constructor stub
	}

	@Override
	double cost() {
		// TODO Auto-generated method stub
		return 0.99;
	}

}
