package stack;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @author zyzhao
 * @date 2022年04月11日 21:58
 */

public class Q150EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Stack<Integer> sNum = new Stack<>();
        Set<String> operatorSet = Set.of("+", "-", "*", "/");
        Integer n1, n2;
        for (String token : tokens) {
            if (operatorSet.contains(token)){
                n2 = sNum.pop();
                n1 = sNum.pop();
                sNum.push(doOperate(n1, n2, token));
            } else {
                sNum.push(Integer.parseInt(token));
            }
        }
        return sNum.pop();
    }

    private int doOperate(int n1, int n2, String operator){
        return switch (operator) {
            case "+" -> n1 + n2;
            case "-" -> n1 - n2;
            case "*" -> n1 * n2;
            case "/" -> n1 / n2;
            default -> 0;
        };
    }

}
