package control_Flow_Statements;

public class DiagonalStar {
    public static void printSquareStar(int number){
        if(number<5){
            System.out.println("Invalid Value");
        }
        else{
        	//i = row
        	//j = col
        
            for(int row =1;row<=number;row++){
                for(int col=1;col<=number;col++){
                    if((row==1 || col==1 || col==number || row==number) || (col==row || col==(number+1-row))){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

	public static void main(String[] args) {
		printSquareStar(5);
//		printSquareStar(9);
		

	}

}
