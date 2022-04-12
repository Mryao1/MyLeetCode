package stack;

import java.util.*;

/**
 * @author zyzhao
 * @date 2022年04月11日 23:18
 */

public class Q239SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length -k + 1];
        Deque<Integer> q = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!q.isEmpty() && nums[i] > nums[q.peekLast()]){
                q.pollLast();
            }
            q.offerLast(i);
        }

        result[0] = nums[q.peekFirst()];

        for (int i = 1; i <= nums.length - k; i++) {
            if (q.peekFirst() < i){
                q.pollFirst();
            }
            while (!q.isEmpty() && nums[i + k - 1] > nums[q.peekLast()]){
                q.pollLast();
            }
            q.offerLast(i + k - 1);
            result[i] = nums[q.peekFirst()];
        }

        return result;
    }
    public int[] maxSlidingWindow1(int[] nums, int k) {
        Queue<Integer[]> q = new PriorityQueue<>((o1, o2) -> Objects.equals(o1[0], o2[0]) ? o1[1] - o2[1] : o2[0] - o1[0]);
        int[] result = new int[nums.length - k + 1];

        for (int i = 0; i < k; i++) {
//            qAdd(q, nums[i]);
            q.offer(new Integer[]{nums[i], i});
        }

        result[0] = q.peek()[0];
        for (int i = 1; i <= nums.length - k; i++) {
            q.offer(new Integer[]{nums[i + k - 1], i + k - 1});
            while (q.peek()[1] < i){
                q.poll();
            }
            result[i] = q.peek()[0];
        }

        return result;
    }

}
