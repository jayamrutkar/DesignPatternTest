package com.statepattern.gumball.old;

public class GumballMachineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GumballMachine machine = new GumballMachine(4);
		System.out.println(machine);
		
		machine.insertQuarter();
		machine.turnCrank();
		machine.dispense();
		System.out.println(machine);
		
		machine.insertQuarter();
		machine.dispense();
		System.out.println(machine);
		
		machine.turnCrank();
		machine.dispense();
		System.out.println(machine);
		
		machine.removeQuarter();
		System.out.println(machine);
		
		machine.insertQuarter();
		machine.turnCrank();
		machine.removeQuarter();
		System.out.println(machine);
		
		machine.insertQuarter();
		machine.turnCrank();
		machine.dispense();
		System.out.println(machine);
		
		machine.insertQuarter();
		machine.turnCrank();
		machine.dispense();
		System.out.println(machine);
	}

}
