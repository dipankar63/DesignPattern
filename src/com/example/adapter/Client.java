package com.example.adapter;

public class Client {
	
	public static void main(String args[]){
		Writer writer = new WriteAdapter();
		writer.out("Hello There");
	}

}
