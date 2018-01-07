package com.singleton.loadbalancer;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Server{
	
	String ipAddress;
	String name;
	public Server(String ipAddress, String name) {
		super();
		this.ipAddress = ipAddress;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Server [ipAddress=" + ipAddress + ", name=" + name + "]";
	}
	
	
	
}

/**
 * The Class LoadBalancer.
 */
public class LoadBalancer implements Serializable, Cloneable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -2359526059635476264L;

	/** The instance. */
	private static LoadBalancer instance = null;
	
	/** The servers. */
	private List<Server> servers = new ArrayList<Server>();
	
	/**
	 * Instantiates a new load balancer.
	 */
	private LoadBalancer(){
		
		servers.add(new Server("192.168.1.1","Localhost"));
		servers.add(new Server("4.4.2.2","Google"));
		servers.add(new Server("83.85.8.8","Yahoo"));
	}
	
	/**
	 * Gets the single instance of LoadBalancer.
	 *
	 * @return single instance of LoadBalancer
	 */
	public static LoadBalancer getInstance(){
		if(instance==null){
			synchronized(LoadBalancer.class){
				if(instance==null){
					instance = new LoadBalancer();
				}
			}
		}
		return instance;
	}
	
	/**
	 * Read resolve.
	 *
	 * @return the object
	 * @throws ObjectStreamException the object stream exception
	 */
	private Object readResolve() throws ObjectStreamException{
		return instance;
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return instance;
	}

	
	/**
	 * Gets the server.
	 *
	 * @return the server
	 */
	public Server getServer(){
		int i = (new Random()).nextInt(servers.size());
		return servers.get(i);
	}

	@Override
	public String toString() {
		return "LoadBalancer [servers=" + servers + "]";
	}
	
	
}
