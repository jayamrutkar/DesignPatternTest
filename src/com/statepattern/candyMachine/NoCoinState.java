package com.statepattern.candyMachine;

public class NoCoinState extends State {

	CandyVendingMachine machine;
	
	public NoCoinState(CandyVendingMachine machine) {
		this.machine = machine;
	}

	@Override
	protected void insertCoin() {
		System.out.println("Coin inserting....");
		machine.changeState(machine.getHasCoinState());
	}

	@Override
	protected void selectCandy() {
		System.out.println("No coin inserted.");
	}

	@Override
	protected void dispense() {
		System.out.println("No coin inserted.");
	}

	@Override
	public String toString() {
		return "NoCoinState []";
	}

	
}
