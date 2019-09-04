package control_Flow_Statements;

public class ForLoop {
	
	public static double calculateInterest(double amount, double interestRate) {
		return (amount*(interestRate/100));
	}
	
	
	public static void main(String[] args) {
//		System.out.println("10.000 at 2% interest = "+"$"+calculateInterest(10000.0,2.0));
//		System.out.println("10.000 at 5% interest = "+"$"+calculateInterest(10000.0, 5.0));
		
		
		//Challenge
		//using the for loop call the calculateInterest method with the amount of 10000 with interestRate of 2,3,4,5,6,7,8
		//and print the results to the console window.
		
		for(int i=2;i<9;i++) {
			System.out.println("10.000 at "+i+"% interest = "+"$"+ String.format("%.2f",calculateInterest(10000.0,i)));
		}
		System.out.println("*******************************");
//to get rid of decimal points in case with 700 add this String.format("%.2f", method. the output will be with just 2 decimal points
		
		//modify for loop to start from 8 and work back to 2%
		for(int i=8;i>1;i--) {
			System.out.println("10.000 at "+i+"% interest = "+"$"+ String.format("%.2f",calculateInterest(10000.0,i)));
		}
		
		//Create a for method using any range of numbers . Determine if the number is a prime number using isPrime method
		//if it is a prime method print it out and increment a count of the number of prime numbers found. if that count is 3 exit
		//the for loop
		//hint: Use the break statement to exit.
		
		int countPrimeNumber = 0;
		for(int i=10;i<50;i++) {
			if(isPrime(i)) { //here we ommit comparing isPrime == true because its done by default
				System.out.println("Prime number is "+i);
				countPrimeNumber++;
				if(countPrimeNumber == 3) {
					break;
				}
			}
			
		}
		
		
		}
	//method of calculating the Prime number
	public static boolean isPrime(int n) {
		if(n==1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
		
		
	 }

}
