package com.statepattern.candyMachine;

public abstract class State {

	abstract protected void insertCoin();
	
	abstract protected void selectCandy();

	abstract protected void dispense();
	
}
