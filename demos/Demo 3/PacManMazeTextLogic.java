/**
 * This is the logic of the text version of the game
 */

import java.util.Scanner;

public class PacManMazeTextLogic {

	//Instance Variables
	private Avatar avatar;
	private Pellet pellet;
	private Ghost ghost;
	private Wall wall;
	private int[][] gameBoard;

	private static final int HEIGHT = 32;
	private static final int WIDTH = 32;

	/**
	 * Creates new objects of type Avatar, Pellet and Wall for the avatar, pellet, and wall variables
	 * Creates a list of all the walls and pellets in gameboard
	 * Notifies the user about the controls
	 * Prints out the initial location and point of the avatar
	 */
	public void initialize() {
		this.avatar = new Avatar();
		this.wall = new Wall(HEIGHT, WIDTH);
		this.gameBoard = wall.getWalls();
		this.pellet = new Pellet(this.gameBoard);
		this.gameBoard = pellet.generatePellet(gameBoard);

		this.ghost = new Ghost(gameBoard);

		// notifies the user about the controls
		System.out.println("\nGame controls:");
		System.out.println("w --> move up, s --> move down, a --> move left, d --> move right");
		System.out.println("e --> exit the game");
		
		// display the initial score and location
		System.out.println("\nAvatar location: " + avatar.getLocation().getX() + "," + avatar.getLocation().getY());
                System.out.println("Points: " + avatar.getScore());
	}

	/** 
	 * Takes user input and avatar is moved if input is valid 
	 * Moves the ghost
	 * Checks if ghost and avatar overlap
	 */
	public void getInputAndMove() {
		System.out.println("Where to move?");
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.nextLine();
		avatar.checkAndMove(input, gameBoard);
		// check overlap with ghost
		ghost.overlapsWith(avatar);
	

		// make the ghost move		
		ghost.move(ghost.pickMove(this.gameBoard, this.avatar));		
		// check again if player and ghost collides
        	ghost.overlapsWith(avatar);
		
	}
		
				
	

	/**
	 * Checks if the avatar location overlaps with a pellet location, then updates point and gets rid of that pellet
	 */
	public void updateScore() {
		if (gameBoard[(int) avatar.getY()][(int) avatar.getX()] == 2) {
			avatar.addScore(10);
			pellet.removePellet(avatar.getLocation());
			System.out.println("collected pellet");
			gameBoard[(int) avatar.getY()][(int) avatar.getX()] = 0;
		}
	}

	/** 
	 * Displays the entire gameboard and score.
	 */ 
	public void printCurrentState() {
		//
		for (int row = 0; row < gameBoard.length; row++) {
			for (int column = 0; column < gameBoard[0].length; column++ ) {
				if ((row == (int) avatar.getY()) && (column == (int) avatar.getX())) {
					System.out.print(" C");
				}
				else if ((row == (int) ghost.getY()) && (column == (int) ghost.getX())) {
					System.out.print(" U");
				}
				else if (gameBoard[row][column] == 1) {
					System.out.print(" #");
				}
				else if (gameBoard[row][column] == 2) {
					if ((row != (int) ghost.getY()) || (column != (int) ghost.getX())) {					
						System.out.print(" .");
					}
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	
	
		System.out.println("Points: " + avatar.getScore());
		System.out.println(ghost.getX() + " " + ghost.getY());
	}






}
