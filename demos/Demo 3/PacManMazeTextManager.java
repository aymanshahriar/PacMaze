/**
 * Manager class that launches the text version of PacManMaze
 */

public class PacManMazeTextManager {
	/**
	 * Main method that uses the methods from the text logic file to run the game
	 * @param args
	 */
	public static void main(String[] args) {
		PacManMazeTextLogic main = new PacManMazeTextLogic();
		main.initialize();
		while (true) { //game loop
			main.getInputAndMove();
			main.updateScore();
			main.printCurrentState();
		}
	}
}
