package com.statepattern.gumball;

public class GumballMachine {

	State noQuarterState;
	State hasQuarterState;
	State outOfBallsState;
	State soldOutState;
	State winnerState;
	
	public State getWinnerState() {
		return winnerState;
	}

	public void setWinnerState(State winnerState) {
		this.winnerState = winnerState;
	}

	State currentState;
	int count=0;
	
	public GumballMachine(int count) {
		super();
		this.noQuarterState = new NoQuarterState(this);
		this.hasQuarterState = new HasQuarterState(this);
		this.outOfBallsState = new OutOfBallsState(this);
		this.soldOutState = new SoldOutState(this);
		this.winnerState= new WinnerState(this);
		this.count = count;
		if(count>0){
			this.currentState=noQuarterState;
		}else{
			this.currentState=outOfBallsState;
		}
	}

	public void changeState(State state){
		this.currentState=state;
	}
	
	public void insertQuarter(){
		currentState.insertQuarter();
	}
	
	public void ejectQuarter(){
		currentState.ejectQuarter();
	}
	public void turnCrank(){
		currentState.turnCrank();
		currentState.dispense();
	}
	
	public void releaseBall(){
		if(count>0){
			count--;
		}
	}
	
	public void refill(int count){
		System.out.println("Machine is refilled with "+count);
		this.count=count;
		if(count>0){
			changeState(this.getNoQuarterState());
		}
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public void setNoQuarterState(State noQuarterState) {
		this.noQuarterState = noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public void setHasQuarterState(State hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}

	public State getOutOfBallsState() {
		return outOfBallsState;
	}

	public void setOutOfBallsState(State outOfBallsState) {
		this.outOfBallsState = outOfBallsState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public State getCurrentState() {
		return currentState;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "GumballMachine [currentState=" + currentState + ", count="
				+ count + "]";
	}
	
}
