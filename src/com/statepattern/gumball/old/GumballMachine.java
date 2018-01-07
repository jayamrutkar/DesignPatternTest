package com.statepattern.gumball.old;

public class GumballMachine {

	final static int SOLD_OUT=0;
	final static int NO_QUARTER=1;
	final static int HAS_QUARTER=2;
	final static int OUT_OF_BALLS=3;
	
	int state = SOLD_OUT;
	int count=0;
	
	public GumballMachine(int cnt){
		this.count=cnt;
		if(this.count>0){
			state= NO_QUARTER;
		}
	}
	
	public void insertQuarter(){
		
		switch(state){
			case HAS_QUARTER: 
				System.out.println("you can not insert quarter."); 
				break;
			case NO_QUARTER: 
				System.out.println("you can insert quarter"); 
				state=HAS_QUARTER; 
				break;
			case SOLD_OUT: 
				System.out.println("Sold out state. Machine is sold out.");
				break;
			case OUT_OF_BALLS:
				System.out.println("Machine is out of balls.");
				break;
		}
		
	}
	
	
	public void removeQuarter(){
		switch(state){
			case HAS_QUARTER: 
				state = NO_QUARTER;
				System.out.println("Removal of quarter."); 
				break;
			case NO_QUARTER: 
				System.out.println("you havn't inserted quarter."); 
				break;
			case SOLD_OUT: 
				System.out.println("Sorry, you have already turned the crank.");
				break;
			case OUT_OF_BALLS:
				System.out.println("You cant remove quarter, you haven't inserted.");
				break;
		}
	}
	
	public void turnCrank(){
		switch(state){
			case HAS_QUARTER: 
				state = SOLD_OUT;
				System.out.println("You have turned the crank. Gumball is sold out."); 
				break;
			case NO_QUARTER: 
				System.out.println("you havn't inserted quarter."); 
				break;
			case SOLD_OUT: 
				System.out.println("We just sold out gumball.");
				break;
			case OUT_OF_BALLS:
				System.out.println("You turned, but there are no gumballs.");
				break;
		}
	}
	
	public void dispense(){
		switch(state){
			case HAS_QUARTER: 
				System.out.println("We have already dispensed."); 
				break;
			case NO_QUARTER: 
				System.out.println("you havn't inserted quarter."); 
				break;
			case SOLD_OUT: 
				System.out.println("A gumball is rolling out of machine.");
				count--;
				if(count==0){
					System.out.println("Machine out of gumballs.");
					state=OUT_OF_BALLS;
				}else{
					state=NO_QUARTER;
				}
				break;
			case OUT_OF_BALLS:
				System.out.println("NO gumballs to dispatch.");
				break;
		}
		
	}

	@Override
	public String toString() {
		return "GumballMachine [state=" + state + ", count=" + count + "]";
	}
	
	
}
