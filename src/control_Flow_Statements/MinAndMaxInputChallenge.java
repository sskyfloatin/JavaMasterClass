package control_Flow_Statements;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
	/*https://www.udemy.com/java-the-complete-java-developer-course/learn/v4/t/lecture/10641378?start=0
	 * Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered
	 * 
	 * Before the user enters the number , print the message "Enter number:"
	 * 
	 * If the user enters ivalid number, break out of the loop and print the minimum and maximum number.
	 * 
	 * Hint:
	 * Use the endless while loop 
	 * 
	 */
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int minNumber = 0, maxNumber = 0;
		int number;
		
		while(true) {
			System.out.println("Enter number");
			
			boolean hasNextInt = scanner.hasNextInt();
			
			if(hasNextInt) {
				number = scanner.nextInt();
				
				//set minimum number to 1 entered number
				if(minNumber == 0 && maxNumber == 0) {
					minNumber = number;
					maxNumber = number;
				}
				else if(number < minNumber) {
					minNumber=number;
				}
				else if(number > maxNumber) {
					maxNumber = number;
				}
		
			}
			else {
				System.out.println("Unable to parse input");
				System.out.println("Minimum number is "+minNumber);
				System.out.println("Maximum number is "+maxNumber);
				break;
				
				
			}
		}
		scanner.close();
	}
		
}
	


