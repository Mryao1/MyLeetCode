package stack;

import java.util.Stack;

/**
 * @author zyzhao
 * @date 2022年04月10日 22:36
 */

public class Q20ValidParentheses {

    public boolean isValid(String s) {
        if (s.length() == 0 || s.length() == 1){
            return false;
        }
        boolean valid = true;
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (char aChar : chars) {
            if (aChar == '(' || aChar == '[' || aChar == '{'){
                stack.push(aChar);
                continue;
            }
            if (stack.empty()){
                valid = false;
                break;
            }
            char pop = stack.pop();
            if ((aChar == ')' && pop != '(') || (aChar == ']' && pop != '[') || (aChar == '}' && pop != '{')){
                valid = false;
                break;
            }
        }
        if (!valid){
            return false;
        }
        return stack.empty();
    }

}
