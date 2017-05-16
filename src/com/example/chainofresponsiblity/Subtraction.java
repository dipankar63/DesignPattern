package com.example.chainofresponsiblity;

public class Subtraction implements ICalculate {

	private ICalculate mNext;

	public void setNext(ICalculate next) {
		this.mNext = next;
	}

	@Override
	public int calculate(String operation, int first, int second) {
		if ("sub".equals(operation)) {
			return Math.abs(first - second);
		} else{
			this.setNext(new Multiplication());
			return mNext.calculate(operation, first, second);
		}
	}

}
