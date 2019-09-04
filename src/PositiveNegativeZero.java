
public class PositiveNegativeZero {
	
	//https://www.udemy.com/java-the-complete-java-developer-course/learn/v4/t/lecture/10225902?start=0

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkNumber(0);
		checkNumber(1);
		checkNumber(-5);
		

	}
	public static void checkNumber(int number) {
		
		if(number > 0) {
			System.out.println("positive");
		}
		else if(number < 0) {
			System.out.println("negative");
		}
		else
		{
			System.out.println("zero");
		}
	}

}
