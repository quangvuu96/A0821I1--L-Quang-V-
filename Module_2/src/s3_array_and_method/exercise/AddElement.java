package s3_array_and_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        do {
            System.out.print(size == 0 ? "Input size of array : " : "Input size less than 20: ");
            size = scanner.nextInt();
        } while (size > 20);
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("Input value of index %d: ", i);
            int input = scanner.nextInt();
            array[i] = input;
        }
        System.out.print("Elements of the array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
        System.out.println("Input value need insert: ");
        int val = scanner.nextInt();
        System.out.println("Input index need insert: ");
        int index = scanner.nextInt();

        int[] tmp = addElement(array, val, index);

        for (int i = 0; i < tmp.length; i++) {
            System.out.print(tmp[i]);
        }
    }

    public static int[] addElement(int[] array, int val, int index) {
        int length = array.length;
        int[] tmp = new int[length + 1];
        for (int i = 0; i < length; i++) {
            tmp[i] = array[i];
        }
        for (int i = length; i > index; i--) {
            if (i != index) {
                tmp[i] = array[i - 1];
            }
        }
        tmp[index] = val;
        return tmp;
    }
}
