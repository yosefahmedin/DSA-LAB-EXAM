//question no5

import java.util.Stack;

public class stacks {
    public static String reverseString(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            stack.push(c);
        }
        
        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }
        
        return reversedString.toString();
    }

    public static void main(String[] args) {
        String inputString = "datastructure";
        String reversedString = reverseString(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Reversed string: " + reversedString);
    }
}