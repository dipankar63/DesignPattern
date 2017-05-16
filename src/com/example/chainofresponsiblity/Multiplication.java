package com.example.chainofresponsiblity;

public class Multiplication implements ICalculate {
/*	private ICalculate mNext;

	public Multiplication(ICalculate next) {
		this.mNext = next;
	}
*/
	@Override
	public int calculate(String operation, int first, int second) {
		if ("mult".equals(operation)) {
			System.out.println("At Multiplication ");
			return first * second;
		} else

			return -1;
	}

	@Override
	public void setNext(ICalculate calculate) {
		// TODO Auto-generated method stub
		
	}

}
