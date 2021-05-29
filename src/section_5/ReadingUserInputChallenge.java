package section_5;

import java.util.Scanner;

public class ReadingUserInputChallenge {
	/*Read 10 numbers from the console entered by the user and print the sum of those numbers
	 * 
	 * Create Scanner
	 * Use the hasNextInt() method from the scanner to check if the user has entered an int value
	 * If hasNextInt() returns false, print the message "Invalid Number". Continue reading until you have read 10 numbers.
	 * Use the nextInt() method to get the number and add it to the sum.
	 * 
	 * Before the user enters each number, print the message "Enter number #x:" where x represents the count i.e. 1,2,3,4 etc.
	 * 
	 * For example, the first message printed to the user would be "Enter number #1:", the next "Enter number #2:", and so on.
	 * 
	 * Hint:
	 * Use a while loop.
	 * Use a counter variable for counting valid numbers.
	 * Close the scanner after you dont need it anymore.
	 */

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int count = 1;
		int sum = 0;
		
		while(count <=10) {
				System.out.println("Enter number # "+count);
				
				boolean hasNextInt = scanner.hasNextInt();
				if(hasNextInt) {
					int number = scanner.nextInt();
					sum +=number;
					count++;
					
					scanner.nextLine();
					if(count == 11) {
						System.out.println("The sum of entered numbers is "+sum);
					}
				}
				else {
					System.out.println("Invalid number");
					scanner.nextLine();
				}
				
			}
		
		scanner.close();

		}
	}


