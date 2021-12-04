package s13_searching_algorithms.exercise;

import java.util.LinkedList;
import java.util.Scanner;

public class StringMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your string : ");
        String string = scanner.nextLine();

        LinkedList<Character> stringMax = new LinkedList<>();

        int size = string.length();
        for (int i = 0; i < size; i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < size; j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > stringMax.size()) {
                stringMax.clear();
                stringMax.addAll(list);
            }
            list.clear();
        }


        for (Character ch : stringMax) {
            System.out.print(ch);
        }
    }
}
