package com.example.decorator;

public class Client {
	
	public static void main(String args[]){
		PannPizza pizza = new PannPizza();
		Tomatoes tomatoes = new Tomatoes(pizza);
		System.out.println(tomatoes.cost());
				
	}

}
