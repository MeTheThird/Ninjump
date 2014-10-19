package Ninjump;

import zen.core.Zen;

public class movingPlatform extends Platform {
	
	int dx = 7;

	public movingPlatform(int newX, int newY) {
		super(newX, newY);
	}


	public void draw() {
		Zen.setColor("pink");
		Zen.fillRect(x - 50, y - 5, 100, 10);
	}
	public void move() {
		x = x + dx;
		if (x > 750) {
			dx = -dx;
		}
		if (x < 50) {
			dx = -dx;
		}
	}

}
