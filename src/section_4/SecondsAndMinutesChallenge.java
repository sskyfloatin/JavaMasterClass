package section_4;

public class SecondsAndMinutesChallenge {
	
	private static final String INVALID_VALUE_MESSAGE = "Inavlid value";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDurationString(65,21));
		System.out.println(getDurationString(65,9));
		System.out.println(getDurationString(3945L));
}
	
	public static String getDurationString(long minutes, long seconds) {
		if((minutes < 0) || (seconds < 0 || seconds > 59)) {
			return INVALID_VALUE_MESSAGE;
		}
		 
		long hours = minutes/60; //how many hours comprise in minutes
		hours += seconds/3600; //how many hours comprise in seconds + minutes
		long remainingMinutes = minutes%60; //calculate remaining minutes
		
		//add leading "0" if hours/minutes/seconds < 10
		
		String hoursString = hours + "h";
		if(hours<10) {
			hoursString = "0" + hoursString;
		}
		
		String minutesString = remainingMinutes + "m";
		if(remainingMinutes<10) {
			minutesString = "0" + minutesString;
		}
		
		String secondsString = seconds + "s";
		if(seconds<10) {
			secondsString = "0" + secondsString;
		}
		
		return hoursString+" "+minutesString+" "+secondsString;
	}
	
	
	public static String getDurationString(long seconds) {
		if(seconds < 0) {
			return INVALID_VALUE_MESSAGE;
		
		}
		long minutes = seconds/60;
		long remainingSeconds = seconds%60;
		return getDurationString(minutes,remainingSeconds);
	}
	
	/*Create a method called getDurationString with two parameters, first parameter minutes and 2nd parameter seconds.
	 * Validate that 1st parameter minutes is >=0
	 * Validate that 2nd parameter seconds is >= 0 and <=59
	 * Method should return "Invalid value" in method if either of the above are not true
	 * If parameters are valid then calculate how many hours minutes and seconds equal the minutes and seconds passed to this method
	 * and return that value as string in format "XXh YYm ZZs" where XX represents a number of hours, YY the minutes and ZZZ seconds.
	 * Create 2nd method of the same name but with only one parameter seconds.
	 * Validate that it is >=0, and return "Invalid value" if it is not true.
	 * If it is valid, then calculate how many minutes are in seconds value and then call the other overloaded method passing the 
	 * correct minutes and seconds calculated so that it can calculate correctly.
	 * Call both methods to print values to the console.
	 * Tips: 
	 * Use int and long for number types is probably a good idea
	 * 1 minute  = 60 seconds and 1 hour = 60 minutes or 3600 seconds.
	 * Methods should be static as we have used previously.
	 * Bonus:
	 * For the input 61 minutes output should be 01h 01m 00s, but it is ok if it is 1h 1m 0s (Tip: use if-else)
	 * Create a new console project and call it section_4.SecondsAndMinutesChallenge
	 */

}
