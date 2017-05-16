package com.example.chainofresponsiblity;

public class Compute implements ICalculate {
    private ICalculate mNext;
    public void setNext(ICalculate next) {
    	this.mNext = next;
	}
	@Override
	public int calculate(String operation, int first, int second) {
	    this.setNext(new Add());
		return mNext.calculate(operation,  first,  second);
	}

}
