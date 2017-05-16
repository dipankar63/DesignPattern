package com.example.chainofresponsiblity;

public class Add implements ICalculate {

	private ICalculate mNext;

	public void setNext(ICalculate next) {
		this.mNext = next;
	}

	@Override
	public int calculate(String operation, int first, int second) {
		if ("add".equals(operation)) {
			return first + second;
		} else {
			this.setNext(new Subtraction());
			return mNext.calculate(operation, first, second);
		}

	}

}
