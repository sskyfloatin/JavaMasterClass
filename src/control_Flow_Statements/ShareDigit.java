package control_Flow_Statements;

/*Write a method named hasSharedDigit with two parameters of type int. 

Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.

The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.


EXAMPLE INPUT/OUTPUT:

* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers

* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99

* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers 
*/

public class ShareDigit {
	
	public static boolean hasSharedDigit(int num1, int num2) {
		if (((num1 < 10) || (num1 > 99))||(num2 < 10) || (num2 > 99)) {
			return false;
			
		}
		int originalNum2 = num2;
		while(num1 > 0) {
			int digit1 = num1%10; //extract last digit from num1; 1st iteration 2;
			num1/=10; //discard last diigit; 1st iter - 1
			num2=originalNum2;
			while(num2 > 0) {
				
				int digit2 = num2%10; //extract last digit from num2; 1st iteration 3;
				if(digit1==digit2) {
					return true;
				}
				num2/=10; //discard last digit; 1st iter 2;
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
//		System.out.println(hasSharedDigit(12,23));//true
//		System.out.println(hasSharedDigit(10,13));//true
//		System.out.println(hasSharedDigit(15,55));//true
//		System.out.println(hasSharedDigit(9,99));//false
//		System.out.println(hasSharedDigit(12,43));//false
		System.out.println(hasSharedDigit(12,13));

	}

}
