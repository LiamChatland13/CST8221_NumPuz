package game;

public class Game {
	public static void main(String[] args) {
		GameModel model = new GameModel();
		GameView view = new GameView();
		GameController contoller = new GameController(view, model);	
	}
}