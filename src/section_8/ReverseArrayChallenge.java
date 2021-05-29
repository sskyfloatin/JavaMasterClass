package section_8;


import java.util.Arrays;

public class ReverseArrayChallenge {

    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};
        reverse(arr);
    }

    private static void reverse(int[] array) {

        System.out.println("Array = " + Arrays.toString(array));
        for(int i=0;i<(array.length-1);i++){
            for(int j=i+1;j<array.length;j++){
                    int s = array[i];
                    array[i] = array[j];
                    array[j] = s;
            }
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }

}
