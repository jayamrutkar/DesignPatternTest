package com.template.method.example1;

public abstract class AlgorithmSkeleton {

	public void execute(){
		step1();
		step2();
		step3();
		if(clientRequired()){
			step4();
		}
	}

	final public void step4() {
		// TODO Auto-generated method stub
		System.out.println("Step 4 common");
	}

	public boolean clientRequired() {
		return true;
	}

	final public void step1() {
		// TODO Auto-generated method stub
		System.out.println("Step1: Common step");
	}
	
	public abstract void step2();
	
	public abstract void step3();
	
	
}
