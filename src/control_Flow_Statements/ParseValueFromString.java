package control_Flow_Statements;

public class ParseValueFromString {

	public static void main(String[] args) {
		
		String numberAsString = "2018";
		System.out.println("numberAsString is "+ numberAsString);
		
		int number = Integer.parseInt(numberAsString);
		System.out.println(number);
		
		numberAsString +=1;
		number +=1;
		
		System.out.println(numberAsString);//will concatenate 1 to a string
		System.out.println(number);//will add 1 to 2018 and will result in 2019

	}

}
