package s16_text_file.practice.sumNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter file path : ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileText readFileText = new ReadFileText();
        readFileText.readFileText(path);
    }
}
