package com.example.proxy;

public class Client {
	
	public static void main(String args[]) throws Exception{
		IComponent component = Factory.getObject("component");
		component.process();
		
	}

}
