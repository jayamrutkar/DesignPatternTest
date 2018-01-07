package com.template.method.test.old.impl;

public class AppTestTM {

	public static void main(String[] args){
		AbstractBeverage beverage = new Coffee();
		beverage.prepareBeverage();
		System.out.println("-------");
		beverage = new Tea();
		beverage.prepareBeverage();
	}
}
