package com.example.adapter;

public class WriteAdapter implements Writer {
	private WriteConsole console = new WriteConsole();

	@Override
	public void out(String text) {
		console.writeConsole(text);

	}

}
