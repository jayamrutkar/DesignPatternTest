package com.test.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class TestSingleton {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException,
		ClassNotFoundException, CloneNotSupportedException, InstantiationException, IllegalAccessException, 
		NoSuchMethodException, SecurityException{
		
		long l1 = System.currentTimeMillis();
		
		Thread t1 = new Thread(){
			public void run(){
				for(int i=0;i<10;i++){
					Singleton s1 = Singleton.getInstance();
					System.out.println("num s1: "+s1.getNum());
				}
				ObjectOutputStream oos;
				try {
					oos = new ObjectOutputStream(new FileOutputStream("connFactory.ser"));
					oos.writeObject(Singleton.getInstance());  
			        oos.close();  
			        
				} catch (IOException e) {
					e.printStackTrace();
				}  
			}
		};
		
		
		Thread t2 = new Thread(){
			public void run(){
				for(int i=0;i<10;i++){
					Singleton s2=Singleton.getInstance();
					System.out.println("num s2: "+s2.getNum());
				}
				ObjectOutputStream oos;
				try {
					oos = new ObjectOutputStream(new FileOutputStream("connFactory1.ser"));
					oos.writeObject(Singleton.getInstance());  
			        oos.close();  
			        
				} catch (IOException e) {
					e.printStackTrace();
				}  
			}
		};
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("connFactory.ser"));  
        Singleton one = (Singleton) ois.readObject();  
        ois.close(); 
        
        System.out.println("One: "+one);
        
        //I am recreating the instance AGAIN by reading the serialized object data store
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("connFactory1.ser"));  
        Singleton two = (Singleton) ois2.readObject();  
        ois2.close();	
		
        System.out.println("Two: "+two);
        
        Singleton oneClone = (Singleton) one.clone();
        System.out.println("one clone: "+oneClone);
        
        Singleton twoClone = (Singleton) two.clone();
        System.out.println("Two clone: "+twoClone);
        
        Class<Singleton> classes = Singleton.class;
        Constructor<Singleton> cons = classes.getDeclaredConstructor();
        cons.setAccessible(true);
        
        Singleton reflectInst = classes.newInstance();
        
        System.out.println(reflectInst);
        
		long l2 = System.currentTimeMillis();
		
		System.out.println((l2-l1));
		
	}
}


enum NewSingleton{
	instance;
}