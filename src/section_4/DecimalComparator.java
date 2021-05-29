package section_4;

public class DecimalComparator {
	
	public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
		int aa = (int) (number1*1000);
		int bb = (int) (number2*1000);
		if(aa==bb) {
			return true;
		}
		return false;
//		if ((number1 *1000) - (number2*1000) < 1 && 
//				(number1 *1000) - (number2*1000) > (-1)){
//				            return true;
//				        } else {
//				            return false;
//				        }
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.175));
		System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.175));
		System.out.println(areEqualByThreeDecimalPlaces(3.175, -3.175));
		System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
		System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
		
		
				int result = 0;
				for (int i = 0; i < 5; i++) {
				  if (i == 3) { 
				     result += 10;
				   } else {
				     result += i;
				   }	
				}
				System.out.println(result);
	}
	
/*
 * Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.


EXAMPLES OF INPUT/OUTPUT:

* areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.

* areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places

* areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.

* areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.


TIP: Use paper and pencil.

TIP: Use casting.

NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.
 */

}
