package section_4;

public class MethodOverloading2 {
	
	//Overloading is when we use same method but with different parameters.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//call 1st method
//		int newScore = calculateScore("Roman", 500);
//		System.out.println("New score is "+ newScore);
		//call 2nd method that is overloaded and has different parameters
//		calculateScore(100);
//		calculateScore();
		System.out.println(calcFeetAndInchesToCentimeters(1,12));
		
		//challenge. call 2nd method
		System.out.println(calcFeetAndInchesToCentimeters(24));
	
	}

	public static int calculateScore(String playerName, int score) {
		System.out.println("Player "+playerName+ " scored "+ score+ " points.");
		return score*1000;
		
	}
	
	public static int calculateScore(int score) {
		System.out.println("Unnamed player scored "+score+" points.");
		return score*1000;
		
	}
	
	private static int calculateScore() {
		System.out.println("No player name, no player score.");
		return 0;//return 0 since we do not have parameters
		
	}
	
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		if((feet < 0) || (inches < 0 && inches > 12)) {
			return -1;
		}
		double centimeters = (feet*12)*2.54;//calculate centimeters in feet
		centimeters += inches*2.54;//calculate centimeters in inches
		System.out.println(feet+ " feet, "+inches+" inches = "+centimeters+" centimeters");
		return centimeters;
		
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		if(inches < 0 ) {
			return -1;
		}
		double feet = (int)inches/12;
		double remainingInches = inches%12;
		System.out.println(inches+" inches = "+feet+" feet and "+remainingInches+" inches.");
		return(calcFeetAndInchesToCentimeters(feet,remainingInches));
		
		
		
	}
	}

	
	/*Create a method called calcFeetAndInchesToCentimeters
	 * It needs to have two parameters.
	 * feet is the first parameter, inches is the 2nd parameter
	 * 
	 * You should validate that the 1st parameter feet is >=0
	 * You should validate that the 2nd parameter inches is >=0 and <=12
	 * return -1 from the method if either of the above is not true
	 * 
	 * If the parameters are valid, then calculate how many centimeters 
	 * comprise the feet and inches passed to this method and return 
	 * that value
	 * 
	 * Create a 2nd method of the same name but with only one parameter 
	 * inches is the parameter
	 * validate that its >=0
	 * return -1 if it is not true
	 * But if its valid, then calculate how many feet are in the inches 
	 * and then here is the tricky part 
	 * call the other overloaded method passing the correct feet and inches 
	 * calculated so that it can calculate correctly.
	 * Hints: Use double for your number datatypes is probably a good idea
	 * 1 inch = 2.54cm and one foot  = 12 inches
	 * use the link https://www.metric-conversions.org/length/feet-to-centimeters.htm to confirm your code is calculating correctly
	 * Calling another overloaded method just requires you to use the right number of parameters 
	 */
