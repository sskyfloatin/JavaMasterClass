package section_4;

public class KeywordsAndExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//there are 53 reserved keywords in Java that can't be esed as variables in code
		//https://en.wikipedia.org/wiki/List_of_Java_keywords - list of keywords
		
		//a mile is equal to 1.609344 kilometers
		double kilometres = (100*1.609344);
		System.out.println(kilometres);
		
		int highScore = 50;
		if(highScore == 50) {
			System.out.println("This is an expression.");
		}
		
		//Write down what parts of code are expressions
		int score = 100;	//'score = 100' - expression 
		if (score > 99) {	//'score > 99' - expression
			System.out.println("You got a high score");	//'You got a high score' - expression
			score = 0;	//'score = 0' - expression
		}

	}

}
