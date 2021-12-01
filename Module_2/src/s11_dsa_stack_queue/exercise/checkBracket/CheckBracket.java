package s11_dsa_stack_queue.exercise.checkBracket;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    static boolean check(String input) {
        String[] array = input.split("");
        Stack<String> bStack = new Stack<String>();
        for (String sym : array) {
            if (sym.equals("(")) {
                bStack.push(sym);
            } else if (sym.equals(")")) {
                if (bStack.isEmpty()) return false;
                String left = bStack.pop();
                if (left.equals(sym)) return false;
            }
        }
        if(bStack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Input : ");
        String input = new Scanner(System.in).nextLine();
        System.out.println(CheckBracket.check(input));
    }
}
