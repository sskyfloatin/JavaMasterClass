
public class SpeedConverter2 {
	
	
	public static long toMilesPerHour(double kilometersPerHour) {
		if(kilometersPerHour < 0) {
			return -1;
		}
		return Math.round(kilometersPerHour/1.609);
	}
	
	public static void printConversion (double kilometersPerHour) {
		
		if (kilometersPerHour < 0) {
			System.out.println("Invalid value");
		}
		else {
		double milesPerHour = toMilesPerHour(kilometersPerHour);
		System.out.println(kilometersPerHour+" km/h = "+ milesPerHour +" mi/h" );
	}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(toMilesPerHour(1.5));
		System.out.println(toMilesPerHour(10.25));
		System.out.println(toMilesPerHour(-5.6));
		System.out.println(toMilesPerHour(25.42));
		System.out.println(toMilesPerHour(10.25));
		System.out.println(toMilesPerHour(75.114));
		printConversion(1.5);
		printConversion(10.25);
		printConversion(-5.6);
		printConversion(75.114);
	}
	}

	