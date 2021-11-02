package s3_array_and_method.exercise;

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row: ");
        int row = scanner.nextInt();
        System.out.println("Enter col: ");
        int col = scanner.nextInt();
        int[][] array = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Input a value array [" + i + "][" + j + "] : " );
                int val = scanner.nextInt();
                array[i][j] = val;
            }
        }

        System.out.println("Array : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(max < array[i][j])
                    max = array[i][j];
            }
        }
        System.out.println("Max value in array : " + max);
    }
}
