package com.statepattern.candyMachine;

public class NoCandyState extends State {

	CandyVendingMachine machine;
	public NoCandyState(CandyVendingMachine machine){
		this.machine=machine;
	}
	
	@Override
	protected void insertCoin() {
		System.out.println("No candies available.");
	}

	@Override
	protected void selectCandy() {
		System.out.println("No candies available.");
	}

	@Override
	protected void dispense() {
		System.out.println("No candies available.");
	}

	@Override
	public String toString() {
		return "NoCandyState []";
	}

	
}
