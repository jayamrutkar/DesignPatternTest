package com.template.method.test.old.impl;

public abstract class AbstractBeverage {

	//This is my template method.
	//It serves as template for algorithm to make beverage
	/*
	 * Template method defines steps of an algorithm and 
	 * allows subclasses to implement one or more steps
	 */
	public final void prepareBeverage(){

		//Steps to perform action
		boilWater();
		addMainSubstance();
		addMilkAndSugar();
		
		//Hook defined for executing certain steps required for execution for certain subclasses
		if(customerNeedsAddons())
			addOns();
		
		pourInCup();
	}

	public boolean customerNeedsAddons() {
		return true;
	}

	private void boilWater() {
		// TODO Auto-generated method stub
		System.out.println(": Boiling Water");
	}

	public abstract void addMainSubstance();

	private void addMilkAndSugar() {
		// TODO Auto-generated method stub
		System.out.println(" Adding Milk And sugar");
	}

	public abstract void addOns();

	private void pourInCup() {
		// TODO Auto-generated method stub
		System.out.println(" Pour into cup");
	}
	
}
