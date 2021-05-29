package section_5;

public class WhileAndDoWhile {

	public static void main(String[] args) {
		
//		int count = 1;
//		while(count != 6) {
//			System.out.println("Count value is "+count);
//			count++;
//		}
//		
//		//same code but with for loop
//		for(count = 1;count !=6; count++) {
//			System.out.println("Count value is "+count);
//		}
//		
//		//another while loop
//		count = 1;
//		while(true) {
//			if(count == 6) {
//				break;
//			}
//			System.out.println("Count value is "+count);
//			count++;
//			
//		}
		
		//do while loop
//		count = 6;
//		do {
//			System.out.println("Count value is "+count);
//			count ++;
//		if(count > 100) {
//			break;
//		}
//		}while(count != 6);
		
		
		//Challenge
		/*Create a method called isEvenNumber that takes a parameter of type int
		 * Its purpose is to determine if the argument passed to the method is an even number or not
		 * return true if an even number, otherwise return false;
		 */
		
//		System.out.println(isEvenNumber(10));
		
		//while loop to print even number from 4 to 20
		int number = 4;
		int finishNumber = 20;
		int evenNumbersFound = 0;
		
		
		while (number <= finishNumber) {
			number++;
			if(!isEvenNumber(number)) {
				continue;
			} 
			
			System.out.println("Even number is "+number);
			
			evenNumbersFound++;
			if(evenNumbersFound >= 5) {
				break;
			}
		} 
			
			System.out.println("Even numbers found is "+evenNumbersFound);
			
	}
		
		//Challenge 2
		/*Modify the while code above 
		 * Make it also record the total number of even numbers it has found 
		 * and break once 5 are found
		 * and at the end, display the total number of even numbers found
		 */
		

	
	//my solution
	public static boolean isEvenNumber(int number) {
		if(number % 2 == 0) {
			return true;
		}
		return false;
	}
	

	
}

	


