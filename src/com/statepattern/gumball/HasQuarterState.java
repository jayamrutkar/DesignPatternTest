package com.statepattern.gumball;

import java.util.Random;

public class HasQuarterState implements State {

	Random winner = new Random();
	
	GumballMachine machine;
	public HasQuarterState(GumballMachine machine) {
		this.machine=machine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Already inserted quarter..");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Removal of quarter..");
		machine.changeState(machine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("Turn crank & roll out gumball.");
		int w = winner.nextInt(2);
		if(w==0 && machine.getCount()>1){
			machine.changeState(machine.getWinnerState());
		}else{
			machine.changeState(machine.getSoldOutState());
		}
		
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("Sold state");
	}

}
