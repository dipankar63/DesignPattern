package com.example.proxy;

public class Component implements IComponent {

	@Override
	public void process() {
		System.out.println("I am in Component");
	}

}
