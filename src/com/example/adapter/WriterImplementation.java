package com.example.adapter;

public class WriterImplementation implements Writer {

	@Override
	public void out(String text) {
		System.out.println("Writer Implementation: "+text);
	}

}
