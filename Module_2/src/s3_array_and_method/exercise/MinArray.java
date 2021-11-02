package s3_array_and_method.exercise;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length :");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Input a value at index " + i + " : ");
            int input = scanner.nextInt();
            array[i] = input;
        }

        System.out.print("Array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }

        System.out.println();
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min)
                min = array[i];
        }
        System.out.println("Minimum value in array : " + min);
    }
}
