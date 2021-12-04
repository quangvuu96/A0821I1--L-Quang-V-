package s15_exception_debug.exercise;

import java.util.Scanner;

public class CheckTriangle {
    public void checkTriangle(double a, double b, double c) {
        try{
            if(a <= 0 || b <= 0 || c <= 0) {
                throw new Exception("Invalid input!!!");
            } else if( a + b <= c || b + c <= a || a + c <= b )
                throw new Exception("Not a triangle!!!");
            else throw new Exception("Is triangle !!");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first edge : " );
        double a = scanner.nextDouble();
        System.out.print("Enter the second edge : ");
        double b = scanner.nextDouble();
        System.out.print("Enter the third edge : ");
        double c = scanner.nextDouble();

        CheckTriangle check = new CheckTriangle();
        check.checkTriangle(a,b,c);
    }
}
