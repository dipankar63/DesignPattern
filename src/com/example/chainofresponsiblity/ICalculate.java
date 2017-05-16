package com.example.chainofresponsiblity;

public interface ICalculate {
	
	public void setNext(ICalculate calculate);
	
	public int calculate(String operation, int first, int second);

}
