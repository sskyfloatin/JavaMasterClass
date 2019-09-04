package control_Flow_Statements;

import java.util.Scanner;

public class ReadingUserInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your year of birth:");
		
		//code to verify input for year is an integer
		boolean hasNextInt = scanner.hasNextInt();
		
		if(hasNextInt) {
			int YearOfBirth = scanner.nextInt();
			int age = 2019 - YearOfBirth;
			
			scanner.nextLine();//handle next line character (enter key)
			
			System.out.println("Enter your name: ");
			
			
			
			String name = scanner.nextLine(); //retrive info from the console
			
			//code to handle invalid input for year of birth (negative numbers)
			if(age >= 0 && age <=100) {
				System.out.println("Your name is "+ name + " and you are "+ age + " years old.");
			}
			else {
				System.out.println("Invalid year of bith.");
			}
		}
		//if input is not an integer type error message
		else {
			System.out.println("Unable to parse year of birth");
		}
		
		scanner.close(); //close scanner to release internal memory

	}

}
