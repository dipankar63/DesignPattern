package com.example.facade;

public class Game {
	
	private InputSystem inSys = new InputSystem();
	private GameObject objects = new GameObject();
	private GameDrawer drawer = new GameDrawer();
	
	public void gameProcess(){
		inSys.getInput();
		objects.update(inSys);
		drawer.draw(objects);
	}

}
