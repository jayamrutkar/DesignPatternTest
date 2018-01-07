package com.template.method.example1;

public class MainTest {

	public static void main(String[] args){
		AlgorithmSkeleton s = new SubClass1();
		s.execute();
		
		s = new SubClass2();
		s.execute();
	}
}
