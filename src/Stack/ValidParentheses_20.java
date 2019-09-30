package Stack;

import java.util.Stack;

/**
 * @author Muggle Lee
 * @Date: 2019/9/30 9:40
 * 问题描述：
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 */
public class ValidParentheses_20 {

    public boolean isValid(String s) {
        Stack stack = new Stack();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            String str = String.valueOf(c[i]);
            if ("(".equals(str) || "{".equals(str) || "[".equals(str)) {
                stack.push(str);
                continue;
            }
            if (!stack.empty() && (")".equals(str) && "(".equals(stack.peek()))
                    || ("}".equals(str) && "{".equals(stack.peek()))
                    || ("]".equals(str) && "[".equals(stack.peek()))) {
                stack.pop();
                continue;
            }else{
                return false;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String str = "(])";
        ValidParentheses_20 validParentheses = new ValidParentheses_20();
        boolean flag = validParentheses.isValid(str);
        System.out.println(flag);

//        Stack stack = new Stack();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        System.out.println(stack.peek());
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack);

    }
}
