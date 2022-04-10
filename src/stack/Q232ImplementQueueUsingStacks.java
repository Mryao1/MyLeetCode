package stack;

import java.util.Stack;

/**
 * @author zyzhao
 * @date 2022年04月10日 21:20
 */

public class Q232ImplementQueueUsingStacks {

    private Stack<Integer> sIn;
    private Stack<Integer> sOut;

    public Q232ImplementQueueUsingStacks() {
        sIn = new Stack<>();
        sOut = new Stack<>();
    }

    public void push(int x) {
        sIn.push(x);
    }

    public int pop() {
        if (sOut.empty()){
            while (!sIn.empty()){
                sOut.push(sIn.pop());
            }
        }
        return sOut.pop();
    }

    public int peek() {
        if (sOut.empty()){
            while (!sIn.empty()){
                sOut.push(sIn.pop());
            }
        }
        return sOut.peek();
    }

    public boolean empty() {
        return (sIn.empty() && sOut.empty());
    }
}
