package snakegame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
	public void keyTyped(KeyEvent e) {
		
	}
	
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
			case KeyEvent.VK_UP:
				if(!(Snake.head.getDirection() == Directions.DOWN) && !Snake.waitToMove) {
					Snake.head.setDirection(Directions.UP);
					Snake.waitToMove = true;
				}
				break;
			case KeyEvent.VK_LEFT:
				if(!(Snake.head.getDirection() == Directions.RIGHT) && !Snake.waitToMove) {
					Snake.head.setDirection(Directions.LEFT);
					Snake.waitToMove = true;
				}
				break;
			case KeyEvent.VK_DOWN:
				if(!(Snake.head.getDirection() == Directions.UP) && !Snake.waitToMove) {
					Snake.head.setDirection(Directions.DOWN);
					Snake.waitToMove = true;
				}
				break;
			case KeyEvent.VK_RIGHT:
				if(!(Snake.head.getDirection() == Directions.LEFT) && !Snake.waitToMove) {
					Snake.head.setDirection(Directions.RIGHT);
					Snake.waitToMove = true;
				}
				break;
		}
	}
	
	public void keyReleased(KeyEvent e) {
		
	}
}
