package s2_loop_in_java.exercise;

import java.util.Scanner;

public class DisplayShape {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the triangle top-left");
        System.out.println("3. Print the triangle top-right");
        System.out.println("4. Print the triangle bottom-left");
        System.out.println("5. Print the triangle bottom-right");
        System.out.println("6. Print isosceles triangle");
        System.out.println("0. EXIT ");
        System.out.println("Enter your choice: ");
        while (choice != 0) {
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 1; i < 5; i++) {
                        for (int j = 1; j < 14; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 7; i > 0; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 1; i < 7; i++) {
                        for (int j = 1; j < 7; j++) {
                            if (j < i)
                                System.out.print(" ");
                            else
                                System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    for (int i = 1; i < 7; i++) {
                        for (int j = 7; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k < i; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    for (int i = 1; i < 7; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    for (int i = 1; i <= 7;i++){
                        for(int j = 1; j <= 7 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= 2*i-1;k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice !!!");
            }
        }
    }
}
