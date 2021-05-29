package section_8;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {
        int[] arr = getIntegers(6);
        printArray(sortIntegers(arr));
    }

    public static int[] getIntegers(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + number + " integer values.");
        int[] values = new int[number];

        for (int i=0;i<values.length;i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int i=0;i<array.length;i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

//    public static int[] sortIntegers(int[] arr) {
//        int[] array;
//        array = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
//        return array;
//    }

    public static int[] sortIntegers(int[] array){

        int[] newArray = Arrays.copyOf(array,array.length);

        for(int i=0;i<(newArray.length-1);i++){
            for(int j=i+1;j<newArray.length;j++){
                if(newArray[j]>newArray[i]){
                    int s = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = s;
                }
            }
        }
        return newArray;
    }

}
