ᗧ·····🍒······ᗣ 

# PacMaze
	
This is a PacMan based game that I created where instead of hardcoded, static levels, each level is a randomly generated maze.

The maze for each level is generated using a recursive backtracking and randomized depth-first search algorithm.

High level description of the AI of the ghosts: Each ghost moves around the maze randomly, until PacMan comes within their line of sight. Then the ghosts will chase after PacMan. If PacMan gets out of their line of sight, the ghosts will again move randomly.

The graphics and GUI were created using the JavaFX platform.

I had a lot of fun making this game, especially when coming up with the ghost AI and random maze generation algorithms.

There is also a test document provided in the JUnit Tests file that describes how each method tests the Avatar class.

## Instructions on how to run the game:
1) Download the folder Project Final 
2) open the zipFile
3) In your terminal do

	i) cd Downloads
	
	ii) cd Project Final
	
4) To compile code do javac *.java
5) For Textbased Program enter java PacManMazeTextManager and follow instructions in terminal prompt
6) For GUI Version enter java Launch
	i) to view controls/goals click instructions
	
	ii) once you feel comfortable close the instructions window and click start
	
	iii) In order to show what happens when the game is won, there is a shortcut provided to the end of the maze

7) Our class PacManMazeTextLogic has JUnit Tests and the Junit tests are in our GitHub Repo under the folder JUnit Test

	i) Download and unzip both the JUnit Test File and Final Project
	
	ii) Create a duplicate of the Final Project and copy all the contents of the JUnit Test file into the duplicate file
	
	iii) In the terminal, navigate to the directory of the duplicate file
	
	iv) Compile everything (includes the junit tests) using javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar *.java
	
	v) The file with the tests is called JUnitTest.java
	
	vi) To run the tests enter command java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore 
JUnitTest

