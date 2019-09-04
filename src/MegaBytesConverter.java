
public class MegaBytesConverter {
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if(kiloBytes < 0) {
			System.out.println("Invalid Value");
		}
		else {
			int megaBytes = kiloBytes/1024;
			int kilobytesRemaining = kiloBytes%1024;
			System.out.println(kiloBytes+" KB = "+megaBytes+ " MB"+" and "+kilobytesRemaining+" KB");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printMegaBytesAndKiloBytes(2500);
		printMegaBytesAndKiloBytes(-1024);
		printMegaBytesAndKiloBytes(5000);
	}

}