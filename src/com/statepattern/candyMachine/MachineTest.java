package com.statepattern.candyMachine;

public class MachineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CandyVendingMachine machine = new CandyVendingMachine(4);
		
		machine.insertCoin();
		machine.selectCandy();
		machine.dispenseCandy();
		System.out.println(machine);
		
		machine.selectCandy();
		System.out.println(machine);
		
		machine.dispenseCandy();
		System.out.println(machine);
		
		machine.insertCoin();
		machine.dispenseCandy();
		System.out.println(machine);
		
		machine.selectCandy();
		machine.dispenseCandy();
		System.out.println(machine);
		
		machine.insertCoin();
		machine.selectCandy();
		machine.dispenseCandy();
		System.out.println(machine);
		
		machine.insertCoin();
		machine.selectCandy();
		machine.insertCoin();
		machine.dispenseCandy();
		System.out.println(machine);
		
		machine.insertCoin();
		machine.selectCandy();
		machine.dispenseCandy();
		System.out.println(machine);
		
		machine.fillCandies(2);
		
		machine.insertCoin();
		machine.selectCandy();
		machine.dispenseCandy();
		System.out.println(machine);
		
	}

}
