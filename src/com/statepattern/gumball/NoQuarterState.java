package com.statepattern.gumball;

public class NoQuarterState implements State {

	GumballMachine machine;
	public NoQuarterState(GumballMachine machine) {
		this.machine=machine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("Inserting quarter");
		machine.changeState(machine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You havn't inserted quarter. Insert quarter first.");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("You turned, but there is no quarter.");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("Insert quarter fisrt.");
	}

}
