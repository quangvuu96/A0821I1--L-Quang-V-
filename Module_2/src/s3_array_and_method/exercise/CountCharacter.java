package s3_array_and_method.exercise;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        String[] str = "Le Quang Vu".split("");
        int count = 0;
        System.out.print("Input a character : ");
        char character = new Scanner(System.in).next().charAt(0);
        for (int i = 0; i < str.length; i++) {
            if(str[i].charAt(0) == character)
                count++;
        }
        System.out.println(count);
    }
}
