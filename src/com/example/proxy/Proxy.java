package com.example.proxy;

public class Proxy implements IComponent {
	private IComponent mTarget;

	public Proxy(IComponent component) {
		this.mTarget = component;
	}

	@Override
	public void process() {
		System.out.println("Proxy Starts");
		mTarget.process();
		System.out.println("Proxy Ends");

	}
}
