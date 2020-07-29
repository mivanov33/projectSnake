package snakegame;

import java.awt.*;
import java.util.ArrayList;

public class Snake {
	public static boolean waitToMove = false;
	
	public static Head head = new Head(7, 7);
	public static ArrayList<Tail> tails = new ArrayList<Tail>();
	public static PickUp pickUp = new PickUp();
	
	public static void addTail() {
		if(tails.size() < 1) {
			tails.add(new Tail(head.getX(), head.getY()));
		} else {
			tails.add(new Tail(tails.get(tails.size()-1).x, tails.get(tails.size()-1).y));
		}
	}
	
	public static void move() {
		//moving tails forward
		if(tails.size() >= 2) {
			for(int i = tails.size()-1; i >= 1; i--) {
				if(tails.get(i).isWait()) {
					tails.get(i).setWait(false);
				} else {
					tails.get(i).setX(tails.get(i - 1).getX());
					tails.get(i).setY(tails.get(i - 1).getY());
				}
			}
		}
		
		//moving first tail to head
		if(tails.size() >= 1) {
			if(tails.get(0).isWait()) {
				tails.get(0).setWait(false);
			} else {
				tails.get(0).setX(head.getX());
				tails.get(0).setY(head.getY());
			}
		}
		
		//moving head
		switch (head.getDirection()) {
			case RIGHT: 
				head.setX(head.getX() + 1);
				break;
			case LEFT: 
				head.setX(head.getX() - 1);
				break;
			case UP: 
				head.setY(head.getY() - 1);
				break;
			case DOWN: 
				head.setY(head.getY() + 1);
				break;
		}
	}
	
	//position to coordinates
	public static Point ptc(int x, int y) {
		Point p = new Point(0, 0);
		p.x = x * 32 + GUI.xoff;
		p.y = y * 32 + GUI.yoff;
		
		return p;
	}
}
