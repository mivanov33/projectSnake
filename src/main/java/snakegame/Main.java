package snakegame;

public class Main {
	public static void main(String[] args) {
		GUI gui = new GUI();
		GameClock gc = new GameClock();
		
		gui.create();
		gc.start();
	}
}
