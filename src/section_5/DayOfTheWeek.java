package section_5;

public class DayOfTheWeek {
	
	/*Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.

The method should not return any value (hint: void)

Using a switch statement print Sunday, Monday, ... Saturday if the int parameter day is 0, 1, ... , 6 respectively, otherwise it should print Invalid day.

Bonus: 
	Write a second solution using if then else, instead of using switch.
	Create a new project in IntelliJ with the  name DayOfTheWeekChallenge
	 */
	
	public static void printDayOfTheWeek(int Day) {
		//switch statement
//		switch(Day) {
//			case 1:
//				System.out.println("Sunday");
//				break;
//			case 2:
//				System.out.println("Monday");
//				break;
//			case 3:
//				System.out.println("Tuesday");
//				break;
//			case 4:
//				System.out.println("Wednesday");
//				break;
//			case 5:
//				System.out.println("Thursday");
//				break;
//			case 6:
//				System.out.println("Friday");
//				break;
//			case 7:
//				System.out.println("Saturday");
//				break;
//			default:
//				System.out.println("Invalid day");
//		}
		
		//if else statement
		if(Day==1) {
			System.out.println("Sunday");
			}
		else if(Day==2) {
			System.out.println("Monday");
		}
		else if(Day==3) {
			System.out.println("Tuesday");
		}
		else if(Day==4) {
			System.out.println("Wednesday");
		}
		else if(Day==5) {
			System.out.println("Thursday");
		}
		else if(Day==6) {
			System.out.println("Friday");
		}
		else if(Day==7) {
			System.out.println("Saturday");
		}
		else {
			System.out.println("Invalid day");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDayOfTheWeek(7);

	}

}
