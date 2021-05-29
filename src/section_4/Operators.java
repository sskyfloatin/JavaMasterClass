package section_4;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Create a double variable with the value 20;
		// 2. Create a second variable of type double with the value 80
		// 3. Add both numbers up and multiply by 25
		// 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
		// 5. Write an "if" statement that displays a message "Total was over the limit"
		//	If the remaining total (#4) is equal to 20 or less
		
		double twenty = 20d;
		double eighty = 80d;
		double sum = (twenty+eighty)*25;
		System.out.println("The sum is "+sum);
		double reminder = sum % 40;
		//System.out.println(reminder);
		if (reminder <= 20) {
			System.out.println("Total was over the limit.");
		}
		

	}

}
