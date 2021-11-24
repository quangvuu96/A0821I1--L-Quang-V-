package s11_dsa_stack_queue.exercise.stackReverse;

import java.util.Stack;

public class ReverseStack {
    public static Stack reverseStack(Stack stack) {
        Stack stack1 = new Stack();
        while(!stack.isEmpty()) {
            stack1.push(stack.pop());
        }
        return stack1;
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        stack.push("Một");
        stack.push("Hai");
        stack.push("Ba");
        stack.push("Bốn");

        System.out.println("Before reverse : ");
        for (String i : stack) {
            System.out.println(i);
        }

        stack = reverseStack(stack);
        System.out.println("After reverse : ");
        for (String i : stack) {
            System.out.println(i);
        }
    }
}
