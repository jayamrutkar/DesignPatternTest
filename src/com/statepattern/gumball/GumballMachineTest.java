package com.statepattern.gumball;

public class GumballMachineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GumballMachine machine = new GumballMachine(8);
		System.out.println(machine);
		
		machine.insertQuarter();
		machine.turnCrank();
		
		System.out.println(machine);
		
		machine.insertQuarter();
		
		System.out.println(machine);
		
		machine.turnCrank();
		
		System.out.println(machine);
		
		machine.ejectQuarter();
		System.out.println(machine);
		
		machine.insertQuarter();
		machine.turnCrank();
		machine.ejectQuarter();
		System.out.println(machine);
		
		machine.insertQuarter();
		machine.turnCrank();
		
		System.out.println(machine);
		
		machine.insertQuarter();
		machine.turnCrank();
		
		System.out.println(machine);
		
		machine.insertQuarter();
		machine.turnCrank();
		
		System.out.println(machine);
		
		machine.refill(4);
		
		machine.insertQuarter();
		machine.turnCrank();
		System.out.println(machine);
	}

}
