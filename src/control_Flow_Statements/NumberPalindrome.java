package control_Flow_Statements;
	
public class NumberPalindrome {
	
	/*Write a method called isPalindrome with one int parameter called number.

The method needs to return a boolean.

It should return true if the number is a palindrome number otherwise it should return false.

Check the tips below for more info about palindromes.

Example Input/Output

isPalindrome(-1221); → should return true

isPalindrome(707); → should return true

isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.

Tip: What is a Palindrome number?  A palindrome number is a number which when reversed is equal to the original number. For example: 121, 12321, 1001 etc.

Tip: Logic to check a palindrome number

Find the the reverse of the given number. Store it in some variable say reverse. Compare the number with reverse.

If both are the the same then the number is a palindrome otherwise it is not.

Tip: Logic to reverse a number

Declare and initialize another variable to store the reverse of a number, for example reverse = 0.

Extract the last digit of the given number by performing the modulo division (remainder).
Store the last digit to some variable say lastDigit = num % 10.
Increase the place value of reverse by one.
To increase place value multiply the reverse variable by 10 e.g. reverse = reverse * 10.
Add lastDigit to reverse.
Since the last digit of the number is processed, remove the last digit of num. To remove the last digit divide number by 10.
Repeat steps until number is not equal to (or greater than) zero. 

A while loop would be good for this coding exercise.


Tip: Be careful with negative numbers. They can also be palindrome numbers.

Tip: Be careful with reversing a number, you will need a parameter for comparing a reversed number with the starting number (parameter).

	 */
	
	public static boolean isPalindrome(int num) {
		if(num<0) {
			num*=-1;
		}
		int reverseNum = 0;
		int originalNum = num;
		
		while(num != 0) {
			reverseNum = reverseNum*10; //1st iter - 0; 2nd iter - 1*10=10; 3rd - 12*10=120
			int lastDigit = num % 10; //1st iteration - 121%10=1(12,1); 2nd iter - 12%10=2(1,2); 3rd - 1%10=1;
			reverseNum = reverseNum + lastDigit; //1st iter - 1; 2nd iter - 10+2=12; 3rd - 12+1=121;
			num/=10; //1st iter - 121/10=12; 2nd iter - 12/10=1; 1/10=0.
			
		}
		if(reverseNum==originalNum) {
			return true;
		}
		return false;
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(323));
		System.out.println(isPalindrome(11));
		System.out.println(isPalindrome(-11));
		
	}
	
}	
	