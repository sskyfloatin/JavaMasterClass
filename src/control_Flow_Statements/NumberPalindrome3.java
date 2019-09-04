package control_Flow_Statements;

public class NumberPalindrome3 {
	
public static boolean isPalindrome(int num) {
		
		int originalNumber = num;
		int palindrome=0;
		while(num > 0) {
			
			palindrome*=10;
			int lastDigit = num%10; //1; 2
			palindrome+=lastDigit;
			num/=10; //12;1
			
			if(originalNumber == palindrome) {
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(123321));
	
}
}
