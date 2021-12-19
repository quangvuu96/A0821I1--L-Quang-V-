package s19_string_regex.exercise.validatePhoneNumbers;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatePhoneNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phone Numbers : ");
        String phoneNum = scanner.nextLine();
        while (!Pattern.matches("^\\(\\d{2}\\)-\\((0)\\d{9}\\)$",phoneNum)){
            System.out.println("Invalid phone number !");
            System.out.println("Please input Phone numbers again : ");
            phoneNum = scanner.nextLine();
        }
        System.out.println("Success ! ");
    }
}
