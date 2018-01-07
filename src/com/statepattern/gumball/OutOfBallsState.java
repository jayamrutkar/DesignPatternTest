package com.statepattern.gumball;

public class OutOfBallsState implements State {

	GumballMachine machine;
	public OutOfBallsState(GumballMachine machine) {
		this.machine=machine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Machine is out of balls. please wait...");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You haven't inserted quarter.");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("You haven't inserted quarter, you can not get ball.");
	}

	@Override
	public void dispense() {
		System.out.println("You cannot dispense. machine out of balls.");
	}

}
