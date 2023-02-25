import java.util.Stack;

public class LC150 {
    /*
     * Input: tokens = ["2","1","+","3","*"]
     * Output: 9
     * Explanation: ((2 + 1) * 3) = 9
     */
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int numbr, num1, num2;
        for (String str : tokens) {
            if (!str.equals("+") && !str.equals("-") && !str.equals("*") && !str.equals("/")) {
                numbr = Integer.parseInt(str);
                stack.push(numbr);
            } else {
                if (!stack.isEmpty()) {
                    num1 = stack.pop();
                    num2 = stack.pop();
                    System.out.println(num1 + "+ " + num2);
                    switch (str) {
                        case "+":
                            stack.push(num1 + num2);
                            break;
                        case "-":
                            stack.push(num1 - num2);
                            break;
                        case "*":
                            stack.push(num1 * num2);
                            break;
                        case "/":
                            stack.push(num1 / num2);
                            System.out.println(num1 + "+ " + num2);
                            System.out.println("peek" + stack.peek());
                            System.out.println("div" + num1 / num2);

                            break;
                    }
                    // System.out.println(stack.peek());
                }
            }

        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String[] tokens = { "4", "13", "5", "/", "+" };
        System.out.println(evalRPN(tokens));
    }

}
