package com.statepattern.candyMachine;

public class CandyVendingMachine {

	State noCoinState;
	State hasCoinState;
	State dispenseState;
	State noCandyState;
	
	State currentState;
	int candyCounts;
	
	
	public CandyVendingMachine(int candyCounts) {
		super();
		this.candyCounts = candyCounts;
		
		noCoinState = new NoCoinState(this);
		hasCoinState = new HasCoinState(this);
		dispenseState = new DispenseState(this);
		noCandyState = new NoCandyState(this);
		
		currentState=noCandyState;
		if(candyCounts>0){
			currentState = noCoinState;
		}
	}
	
	public void changeState(State state){
		this.currentState=state;
	}
	
	public void insertCoin(){
		currentState.insertCoin();
	}
	
	public void selectCandy(){
		currentState.selectCandy();
	}
	
	public void dispenseCandy(){
		currentState.dispense();
	}

	public void rollCandy(){
		candyCounts--;
	}
	
	public void fillCandies(int count){
		this.candyCounts = count;
		if(count>0){
			currentState=noCoinState;
		}
	}
	
	public State getNoCoinState() {
		return noCoinState;
	}

	public void setNoCoinState(State noCoinState) {
		this.noCoinState = noCoinState;
	}

	public State getHasCoinState() {
		return hasCoinState;
	}

	public void setHasCoinState(State hasCoinState) {
		this.hasCoinState = hasCoinState;
	}

	public State getDispenseState() {
		return dispenseState;
	}

	public void setDispenseState(State dispenseState) {
		this.dispenseState = dispenseState;
	}

	public State getNoCandyState() {
		return noCandyState;
	}

	public void setNoCandyState(State noCandyState) {
		this.noCandyState = noCandyState;
	}

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	public int getCandyCounts() {
		return candyCounts;
	}

	public void setCandyCounts(int candyCounts) {
		this.candyCounts = candyCounts;
	}

	@Override
	public String toString() {
		return "CandyVendingMachine [currentState=" + currentState
				+ ", candyCounts=" + candyCounts + "]";
	}
	
	
}
