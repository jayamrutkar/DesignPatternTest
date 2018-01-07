package com.statepattern.candyMachine;

public class DispenseState extends State {

	CandyVendingMachine machine;

	public DispenseState(CandyVendingMachine machine) {
		this.machine = machine;
	}
	
	@Override
	protected void insertCoin() {
		System.out.println("Please wait... we are processing older request.");
	}

	@Override
	protected void selectCandy() {
		System.out.println("Error. System is dispensing candy.");
	}

	@Override
	protected void dispense() {
		System.out.println("Dispensing candy. ");
		machine.rollCandy();
		if(machine.getCandyCounts()>0){
			machine.changeState(machine.getNoCoinState());
		}else{
			machine.changeState(machine.getNoCandyState());
		}
	}

	@Override
	public String toString() {
		return "DispenseState";
	}

	
}
