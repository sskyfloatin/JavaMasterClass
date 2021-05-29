package section_4;

public class MethodsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//to avoid duplicating of code and variables we create methods and pass parameters in brackets
		
		//we can assign a method to a variable
		int highScore = calculateScore(true, 999, 5, 100);
		System.out.println("The high score is "+highScore);
		
		calculateScore(true, 999, 5, 100);
		
		calculateScore(true, 10000,8,200);
		
		//solution to challenge
		int playerScore = calculateHighScorePosition(1500);
		displayHighScorePosition("Bob", playerScore);
		
		playerScore = calculateHighScorePosition(900);
		displayHighScorePosition("Lisa", playerScore);
		
		playerScore = calculateHighScorePosition(400);
		displayHighScorePosition("Tom", playerScore);
		
		playerScore = calculateHighScorePosition(50);
		displayHighScorePosition("Gilbert", playerScore);
		
		
		
	}
	
	public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus) { //method with parameters we pass
		
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore+=1000;
			return finalScore;
			
		}
		else {
			return -1; //negative -1 is reserved to indicate invalid value or value not found
		}
	}
	
	
	
	//Challenge
	//Create a method called displayHighScorePosition
	//It should have a player name as a parameter , and 2nd parameter as a position in the high score table
	//You should display the players name along with a message like " managed to get into position " and the position
	//they got and a further message " on the high score table".
	//
	//Create a 2nd method called calculateHighScorePosition 
	//it should be sent one argument only, the player score
	//it should return an int
	//the return data should be
	//1 if the score is >1000
	//2 if the score is >500 and < 1000
	//3 if the score is > 100 and < 500
	//4 in all other cases
	//call both methods and display the results of the following 
	//a score of 1500, 900, 400, and 50
	

	public static void displayHighScorePosition(String playerName, int highScore) {
		System.out.println(playerName+" managed to get into position "+highScore+" on the high score table.");
	}
	
	public static int calculateHighScorePosition(int playerScore) {
//		if(playerScore >=1000) {
//			return 1; 
//		}
//		else if (playerScore >=500) {
//			return 2;
//		}
//		else if (playerScore >= 100) {
//			return 3;
//		}
//		return 4;
		
		//2nd way of solution
		int position=4;
		if(playerScore >=1000) {
			position = 1;
		}
		else if (playerScore >=500) {
			position = 2;
		}
		else if (playerScore >=100) {
			position = 3;
		}
		return position;
		
	}
	
	

}
