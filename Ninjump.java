package Ninjump;

import zen.core.Zen;

public class Ninjump {

	public static void main(String[] args) {
		
		Zen.create(800, 600);
		Ninja ned = new Ninja();
		Platform p1 = new Platform(300, 400);
		movingPlatform mp = new movingPlatform(300, 350);
		
		while(true) {
			Zen.setBackground("light blue");
			Zen.setColor("green");
			Zen.fillRect(0, 500, 800, 100);
			
			ned.draw();
			ned.move();
			ned.checkPlatform(p1);
			
			p1.draw();
			
			mp.move();
			mp.draw();
			
			Zen.buffer(30);
		}

	}

}
