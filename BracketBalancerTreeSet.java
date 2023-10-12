import java.util.TreeSet;

public class BracketBalancerTreeSet {
    public static void main(String[] args) {
        System.out.println(isBalanced("{{(){}}}")); // true
        System.out.println(isBalanced("}{}{"));     // false
        System.out.println(isBalanced("({})"));     // true
    }

    public static boolean isBalanced(String expression) {
        TreeSet<Bracket> simulatedStack = new TreeSet<>();

        int order = 0;
        for (char ch : expression.toCharArray()) {
            if (ch == '{' || ch == '(' || ch == '[') {
                simulatedStack.add(new Bracket(ch, order));
                order++;
            } else if (ch == '}' || ch == ')' || ch == ']') {
                if (simulatedStack.isEmpty()) return false;

                Bracket last = simulatedStack.last();
                simulatedStack.remove(last);
                if (!isPairValid(last.bracket, ch)) {
                    return false;
                }
                order--;
            }
        }

        return simulatedStack.isEmpty();
    }

    private static boolean isPairValid(char open, char close) {
        return (open == '{' && close == '}') || (open == '(' && close == ')') || (open == '[' && close == ']');
    }

    private static class Bracket implements Comparable<Bracket> {
        char bracket;
        int order;

        Bracket(char bracket, int order) {
            this.bracket = bracket;
            this.order = order;
        }

        @Override
        public int compareTo(Bracket other) {
            return Integer.compare(this.order, other.order);
        }
    }
}
