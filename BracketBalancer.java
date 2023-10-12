import java.util.Stack;

public class BracketBalancer {
    public static void main(String[] args) {
        System.out.println(isBalanced("{{(){}}}")); // true
        System.out.println(isBalanced("}{}{"));     // false
        System.out.println(isBalanced("({})"));     // true
    }

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == '}' || ch == ')' || ch == ']') {
                if (stack.isEmpty()) return false;

                char last = stack.pop();
                if (!isPairValid(last, ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isPairValid(char open, char close) {
        return (open == '{' && close == '}') || (open == '(' && close == ')') || (open == '[' && close == ']');
    }
}
