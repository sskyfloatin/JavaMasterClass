package section_8;

import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {
        System.out.println("Min number is " + findMin(readElements(readInteger())));
    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int num) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[num];
        for (int i=0; i<num; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    private static int findMin(int[] num) {
        int temp, i, j;
        for (i=0; i<num.length-1;i++) {
            for (j=0; j<num.length-1;j++) {
                if (num[j] > num[j+1]) {
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        return num[0];
    }

}
