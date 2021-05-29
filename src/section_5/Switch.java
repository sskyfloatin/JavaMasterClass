package section_5;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value = 3;
		if(value==1) {
			System.out.println("Value was 1");
		}
		else if(value==2) {
			System.out.println("Value was 2");
		}
		else {
			System.out.println("Value was neither 1 nor 2");
		}
		
		//same logic using Swith statement
		int switchValue = 6;
		switch(switchValue) {
			case 1:
				System.out.println("Value was 1");
				break;	//we use break keyword after each case to stop executing code further
			case 2:
				System.out.println("Value was 2");
				break;
			case 3: case 4: case 5:
				System.out.println("Value was 3, 4 or 5");
				System.out.println("Actually value was "+switchValue);
				break;
			default:
				System.out.println("Value was not 1,2,3,4 or 5");
				break;
		}
		
		/*Challenge:
		 * Create a new switch statement using char instead of int
		 * create a new char variable
		 * create a switch statement testing for
		 * A, B, C, D or E
		 * display a message if any of these are found and then break
		 * Add a default which displays a message saying not found.
		 */
		
		//Solution to challenge
		char switchChar = 'm';
		switch(switchChar) {
			case 'a':
				System.out.println("Char was A");
				break;
			case 'b':
				System.out.println("Char was B");
				break;
			case 'c':
				System.out.println("Char was C");
				break;
			case 'd':
				System.out.println("Char was D");
				break;
			case 'e':
				System.out.println("Char was E");
				break;
			default:
				System.out.println("Not found");
		}
		//we may have not proper results when type switch char with lower case. use method toLowerCase and all case write with lower case
		String month = "JUNE";
		switch(month.toLowerCase()) {
			case "january":
				System.out.println("Month was Jan");
				break;
			case "june":
				System.out.println("Month was June");
				break;
			default:
				System.out.println("Not sure.");
				break;
		}
		 

	}
	
}
