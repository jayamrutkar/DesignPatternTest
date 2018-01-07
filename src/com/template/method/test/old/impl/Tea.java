package com.template.method.test.old.impl;

public class Tea extends AbstractBeverage{

	@Override
	public void addMainSubstance() {
		// TODO Auto-generated method stub
		System.out.println("Adding Tea Powder");
	}

	@Override
	public void addOns() {
		// TODO Auto-generated method stub
		addGinger();
	}

	private void addGinger() {
		// TODO Auto-generated method stub
		System.out.println("Add ginger");
	}
	
	/*public void prepareTea(){
		//steps
		boilWater();
		addSugarAndTeaPowder();
		addGinger();
		addMilk();
		pourTeaInCup();
		
	}

	private void addMilk() {
		// TODO Auto-generated method stub
		System.out.println("Add milk");
	}

	private void pourTeaInCup() {
		// TODO Auto-generated method stub
		System.out.println("Pour tea in cup");
	}

	private void addGinger() {
		// TODO Auto-generated method stub
		System.out.println("Add ginger");
	}

	private void addSugarAndTeaPowder() {
		// TODO Auto-generated method stub
		System.out.println("Add sugar & tea powder");
	}

	private void boilWater() {
		// TODO Auto-generated method stub
		System.out.println("Boil Water");
	}
	*/
	
}
