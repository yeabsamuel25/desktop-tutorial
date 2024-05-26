import java.util.Stack;

public class Question5 {

    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder reversedString = new StringBuilder();

        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {
        // Example usage
        String input = "hello";
        String output = reverseString(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}
