package com.statepattern.candyMachine;

public class HasCoinState extends State {

	CandyVendingMachine machine;

	public HasCoinState(CandyVendingMachine machine) {
		this.machine = machine;
	}

	@Override
	protected void insertCoin() {
		System.out.println("Coin already inserted. processing for previous request. Please wait.");
	}

	@Override
	protected void selectCandy() {
		System.out.println("Button pressed. Moving to dispense state");
		machine.changeState(machine.getDispenseState());
	}

	@Override
	protected void dispense() {
		System.out.println("Please select button to dispense candy.");
	}

	@Override
	public String toString() {
		return "HasCoinState []";
	}

	
}
