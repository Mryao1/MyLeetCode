package stack;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author zyzhao
 * @date 2022年04月10日 21:55
 */

public class Q225ImplementStackUsingQueues {

    Queue<Integer> q1, q2;
    Boolean first;

    public Q225ImplementStackUsingQueues() {
        q1 = new PriorityQueue<>();
        q2 = new PriorityQueue<>();
        first = true;
    }

    public void push(int x) {
        if (first){
            q1.add(x);
        } else {
            q2.add(x);
        }
    }

    public int pop() {
        if (first){
            while (q1.size() != 1){
                q2.add(q1.poll());
            }
            first = false;
            return q1.poll();
        } else {
            while (q2.size() != 1){
                q1.add(q2.poll());
            }
            first = true;
            return q2.poll();
        }
    }

    public int top() {
        int r = pop();
        push(r);
        return r;
    }

    public boolean empty() {
        return (q1.isEmpty() && q2.isEmpty());
    }
}
