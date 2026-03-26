import java.util.Stack;

public class stackinsertion {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Insert elements using loop (cleaner)
        for (int i = 1; i <= 6; i++) {
            stack.push(i);
        }

        System.out.println("Initial Stack: " + stack);

        stack.pop();                    // pop
        stack.pop();                    // pop
        stack.push(6);                  // push 6
        stack.pop();                    // pop
        stack.push(7);                  // push 7

        System.out.println("Final Stack: " + stack);
    }
}
