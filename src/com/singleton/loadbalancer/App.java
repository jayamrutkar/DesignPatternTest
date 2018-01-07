package com.singleton.loadbalancer;

public class App {
	
	public static void main(String[] args){
		LoadBalancer l = LoadBalancer.getInstance();
		System.out.println(l);
		
		LoadBalancer l1 = l.getInstance();
		System.out.println(l1);
		
		LoadBalancer l2 = LoadBalancer.getInstance();
		System.out.println(l2);

		System.out.println(l.getServer());
		System.out.println(l.getServer());
		System.out.println(l.getServer());
		System.out.println(l.getServer());
		System.out.println(l.getServer());
		System.out.println(l.getServer());
		
		Runtime r = Runtime.getRuntime();
		System.out.println(r);
		System.out.println(Runtime.getRuntime());
		
	}

}
