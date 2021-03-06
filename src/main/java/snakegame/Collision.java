package snakegame;

public class Collision {
	//collision with the snake's tail
	public static boolean collideSelf() {
		for (int i = 0; i < Snake.tails.size(); i++) {
			if(Snake.head.getX() == Snake.tails.get(i).getX() && Snake.head.getY() == Snake.tails.get(i).getY() 
					&& !Snake.tails.get(i).isWait()) {
				return true;
			}
		}
		return false;
	}
	
	//collision with the wall
	public static boolean collideWall() {
		return (Snake.head.getX() < 0 || Snake.head.getX() > 15 || Snake.head.getY() < 0 || Snake.head.getY() > 15);
	}
	
	//collision with an apple or a pear
	public static void collidePickUp() {
		if(Snake.head.getX() == Snake.pickUp.getX() && Snake.head.getY() == Snake.pickUp.getY()) {
			Snake.pickUp.reset();
			Snake.addTail();
		}
	}
}
