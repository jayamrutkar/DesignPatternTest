package com.test.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton implements Serializable, Cloneable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1;

	private static Singleton instance= null;

	private int num;
	
	private static int counter=1;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(instance == null){
			synchronized(Singleton.class){
				if(instance==null){
					instance= new Singleton();
					instance.num=counter++;
				}
			}
		}
		return instance;
	}
	
	public int getNum(){
		return num;
	}
	
	
	private Object readResolve() throws ObjectStreamException{
		return instance;
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return instance;
	}

	
}
