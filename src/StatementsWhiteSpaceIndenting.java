
public class StatementsWhiteSpaceIndenting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myVariable = 50; // this complete line is a Statement in Java. Statements usually end with ";"
		myVariable++;
		myVariable--;
		System.out.println("This is statement");

		System.out.println("This is " + "another " + "one more."); // it's all 1 statement in 3 rows

		int anotherVariable = 50;
		myVariable--;
		System.out.println("This is another one"); // multiple satements can take 1 row
		
		//identation is all about good readibility of your code (adding space before/after lines of code)
		//can be made automatically by pressing Source-Format or hotkey ctrl + shift + F

	}

}
