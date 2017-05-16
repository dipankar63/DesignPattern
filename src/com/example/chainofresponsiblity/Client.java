package com.example.chainofresponsiblity;

public class Client {
	
	public static void main(String args[]){
	 ICalculate calculate = new Compute();
	 System.out.println(calculate.calculate("mult", 6, 5));
	}

}
