package com.example.decorator;

public class PannPizza implements IPizza{

	@Override
	public String description() {
		return "Pann Pizza";
	}

	@Override
	public int cost() {
		return 100;
	}

	
	
}
