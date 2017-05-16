package com.example.decorator;

public class Tomatoes extends PannPizzaTopping {

	public Tomatoes(IPizza pizza) {
		this.mPizza = pizza;
	}

	@Override
	public String description() {
		return "Tomatoes Topping";
	}

	@Override
	public int cost() {
		return mPizza.cost() + 1;
	}

}
