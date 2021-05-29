package section_4;

public class IfKeywordAndCodeBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean gameOver = true;
		int score = 999;
		int levelCompleted = 5;
		int bonus = 100;
		
		if (score <= 5000 && score > 1000) {
			System.out.println("Your score was less than 5000 but greater than 1000");
		}
		else if (score < 1000) {
			System.out.println("Your score is less than 1000");
		}
		else {
			System.out.println("Got here");
		}
		
		if (gameOver) {		//here we can omit == true and it still works 
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was "+ finalScore );
		}
		
		//Print out a second score on the screen with the following 
		//score set to 10000
		//levelCompleted set to 8
		//bonus set to 200
		//But make sure the first printout above still displays as well
		
		
		//so here we just reuse variables and assign new values to them
		//when we run the code we see that both results get printed.
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score is "+ finalScore);
		}
		
		
		
		

	}

}
