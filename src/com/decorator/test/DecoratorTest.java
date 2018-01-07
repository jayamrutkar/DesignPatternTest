package com.decorator.test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class DecoratorTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Beverage b1 = new Espresso();
		
		b1 = new Mocha(b1);
		b1 = new Mocha(b1);
		b1 = new Soy(b1);
		
		System.out.println(b1.getDescription() +" having cost $"+b1.cost());
		
		Beverage b2 = new HouseBlend();
		b2 = new Whip(b2);
		b2 = new Soy(b2);
		System.out.println(b2.getDescription()+" having cost $"+b1.cost());
		
		
		//Java IO package example
		
		InputStream fs = new FileInputStream("C:/jay/prins.txt");
		System.out.println(fs.available());
		
		fs = new BufferedInputStream(fs);
		System.out.println(fs.available());
		
	}

}
