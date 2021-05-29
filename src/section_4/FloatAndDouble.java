package section_4;

public class FloatAndDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int myIntValue = 5/3;
			//width 32 bytes (4 bytes)
			float myFloatValue = 5f/3f;	
			//width 32 bytes (4 bytes)
			double myDoubleValue = 5d/3d;	
			//width 64 bytes (8 bytes)
			System.out.println("myIntValue = "+myIntValue);
			System.out.println("myFloatValue = "+myFloatValue);
			System.out.println("myDoubleValue = "+myDoubleValue);
			
			
			//Exsercise
			//Convert a given number of pounds to kilogram
			//1. Create a variable to store ther number of pounds 
			//2. Calculate the number of kilograms for the number above and store in a variable
			//3. Print out result.
			//
			//Notes: 1 pound is equal to 0.45359237 kilograms.
			
			double pounds = 200d;
			double kilograms = pounds * 0.45359237d;
			System.out.println(kilograms);
	}

}
