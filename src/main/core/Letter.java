package main.core;

import java.util.ArrayList;

public class Letter {
	
	public int width;
	public int height;
	public ArrayList<ArrayList<Character>> Character;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		if(width > 0 && width < 30) {
			this.width = width;
		}
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		if(height > 0 && height < 30) {
			this.height = height;
		}
	}
	public ArrayList<ArrayList<Character>> getCharacter() {
		return Character;
	}
	public void setCharacter(ArrayList<ArrayList<Character>> character) {
		Character = character;
	}

	
	
	
}
