package Ninjump;

import zen.core.Zen;

public class Platform {
	
	int x;
	int y;
	
	public Platform(int newX, int newY) {
		x = newX;
		y = newY;
	}

	public void draw() {
		Zen.setColor("orange");
		Zen.fillRect(x - 50, y - 5, 100, 10);
		
	}

}
