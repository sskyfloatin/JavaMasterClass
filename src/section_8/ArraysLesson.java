package section_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraysLesson {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = getIntegers(5);
        printArray(sortIntegers(arr));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.");
        int[] values = new int[number];

        for (int i=0;i<values.length;i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int i=0;i<array.length;i++) {
            System.out.println("Element " + i + ", typed value was " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] arr) {
        int[] array;
        array = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
        return array;
    }

}
