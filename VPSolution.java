import java.util.Stack;

class VPSolution {
    public static boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
        
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
            
                if (stack.isEmpty()) {
                    return false; 
                }
                char top = stack.pop();

                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input1 = "()";
        String input2 = "()[]{}";
        String input3 = "(]";
        String input4 = "([)]";
        String input5 = "{[]}";

        System.out.println(input1 + " is valid: " + isValid(input1));
        System.out.println(input2 + " is valid: " + isValid(input2));
        System.out.println(input3 + " is valid: " + isValid(input3));
        System.out.println(input4 + " is valid: " + isValid(input4));
        System.out.println(input5 + " is valid: " + isValid(input5));
    }
}