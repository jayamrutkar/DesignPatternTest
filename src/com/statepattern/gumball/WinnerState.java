package com.statepattern.gumball;

public class WinnerState implements State {

	GumballMachine machine;
	public WinnerState(GumballMachine machine){
		this.machine=machine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Please wait... you can insert quarter once ball is rolling out.");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You cannot eject quarter, you already have turned crank.");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("You cannot turn crank twice");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("You are winner.");
		machine.releaseBall();
		if(machine.getCount()>0){
			machine.releaseBall();
			if(machine.getCount()>0){
				machine.changeState(machine.getNoQuarterState());
			}else{
				machine.changeState(machine.getOutOfBallsState());
			}

		}else{
			machine.changeState(machine.getOutOfBallsState());
		}
	}

}
