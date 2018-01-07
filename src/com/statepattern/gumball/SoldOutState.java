package com.statepattern.gumball;

public class SoldOutState implements State {

	GumballMachine machine;

	public SoldOutState(GumballMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Plz wait, we are already giving gumball");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You have turned crank, you can not eject quarter.");
	}

	@Override
	public void turnCrank() {
		System.out.println("You already have turned crank.");
	}

	@Override
	public void dispense() {
		machine.releaseBall();
		if (machine.count > 0) {
			machine.changeState(machine.getNoQuarterState());

		} else {
			System.out.println("Out of gum balls.");
			machine.changeState(machine.getOutOfBallsState());
		}
	}

}
