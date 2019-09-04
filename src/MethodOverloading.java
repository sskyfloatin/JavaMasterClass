
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int newScore = calculateScore("Tim", 123);//calling 1s method
		System.out.println("New score is "+newScore);//print out what is returned by the method.
		
		//calling 2nd overloaded method
		calculateScore(1);
		calculateScore();
		calcFeetAndInchesToCentimeters(6,0);
		//calling overloaded method
		calcFeetAndInchesToCentimeters(157);
		
	}
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player "+playerName+ " scored "+score+" points.");
		return score*1000;
	}
	
	public static int calculateScore(int score) {
		System.out.println("Unnamed player scored "+score+" points.");
		return score*1000;
	}
	
	public static int calculateScore() {
		System.out.println("No player name, no player score.");
		return 0;
	}
	
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		if((feet < 0) || (inches < 0 || inches > 12)) {
			System.out.println("Feet or inches parameters are invalid.");
			return -1;
		}
		double sentimeters = (feet * 12) * 2.54;//calculate sentimeters in feet
		sentimeters += inches * 2.54;//calculate sentimeters in inches
		System.out.println(feet+ " feet "+inches+" inches = "+sentimeters + " cm");
		return sentimeters;
	}
	public static double calcFeetAndInchesToCentimeters(double inches) {
		if(inches<0) {
			System.out.println("Invalid inches parameter provided.");
			return -1;
		}
		double feet = (int)inches / 12;
		double remainingInches = (int) inches % 12;
		System.out.println(inches+" inches = "+feet+" feet and "+remainingInches+" inches.");
		return calcFeetAndInchesToCentimeters(feet,remainingInches);
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
