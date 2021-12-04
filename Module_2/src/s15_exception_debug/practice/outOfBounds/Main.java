package s15_exception_debug.practice.outOfBounds;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] array = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease enter the index of any element : ");
        int index = scanner.nextInt();

        try{
            System.out.println("Element at index " + index + " is " + array[index] );
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Index exceeds the limit of the array ");
        }
    }
}
