package snakegame;

import java.awt.*;

import javax.swing.*;

public class Draw extends JLabel {
	Point p;
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
		
		//draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, GUI.width, GUI.height);
		
		//draw snake tails
		g.setColor(new Color(50, 200, 50));
		for(int i = 0; i < Snake.tails.size(); i++) {
			p = Snake.ptc(Snake.tails.get(i).getX(), Snake.tails.get(i).getY());
			g.fillRect(p.x, p.y, 32, 32);
		}
		
		//draw snake head
		g.setColor(new Color(0, 150, 0));
		p = Snake.ptc(Snake.head.getX(), Snake.head.getY());
		g.fillRect(p.x, p.y, 32, 32);
		
		//draw apple
		g.setColor(new Color(200, 50, 0));
		p = Snake.ptc(Snake.pickUp.getX(), Snake.pickUp.getY());
		g.fillRect(p.x, p.y, 32, 32);
		
		//draw grid
		g.setColor(Color.GRAY);
		for(int i = 0; i < 16; i++) {
			for(int j = 0; j < 16; j++) {
				g.drawRect(i * 32 + GUI.xoff, j * 32 + GUI.yoff, 32, 32);
			}
		}
		
		//draw border
		g.setColor(Color.BLACK);
		g.drawRect(GUI.xoff, GUI.yoff, 512, 512);
		
		repaint();
	}
}