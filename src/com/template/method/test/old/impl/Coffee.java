package com.template.method.test.old.impl;

public class Coffee extends AbstractBeverage{

	@Override
	public void addMainSubstance() {
		System.out.println("Adding coffee.");
		
	}

	@Override
	public void addOns() {
		System.out.println("Coffee adons");
	}

	//This is hook if required to implement
	public boolean customerNeedsAddons() {
		return false;
	}
	
	/*public void prepareCoffee(){
		//Steps to prepare coffee
		boilWater();
		brewCoffeeGrinds();
		addSugarMilk();
		pourInCup();
	}

	//Each step has its own implementation
	private void pourInCup() {
		// TODO Auto-generated method stub
		System.out.println("Pour in Cup");
	}

	private void addSugarMilk() {
		// TODO Auto-generated method stub
		System.out.println("Adding Sugar & Milk");
	}

	private void brewCoffeeGrinds() {
		// TODO Auto-generated method stub
		System.out.println("Brewing coffee grinds");
	}

	private void boilWater() {
		// TODO Auto-generated method stub
		System.out.println("Boil Water");
	}
*/	
	
	
	
}
