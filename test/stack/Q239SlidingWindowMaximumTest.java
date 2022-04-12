package stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q239SlidingWindowMaximumTest {

    private static final Q239SlidingWindowMaximum q = new Q239SlidingWindowMaximum();

    @Test
    public void test1() {
        int[] test = new int[]{1,3,-1,-3,5,3,6,7};
        int[] result = new int[]{3,3,5,5,6,7};
        assertArrayEquals(result, q.maxSlidingWindow(test, 3));
    }

    @Test
    public void test2() {
        int[] test = new int[]{1};
        int[] result = new int[]{1};
        assertArrayEquals(result, q.maxSlidingWindow(test, 1));
    }

    @Test
    public void test3() {
        int[] test = new int[]{1,3,1,2,0,5};
        int[] result = new int[]{3,3,2,5};
        assertArrayEquals(result, q.maxSlidingWindow(test, 3));
    }

    @Test
    public void test4() {
        int[] test = new int[]{7,2,4};
        int[] result = new int[]{7,4};
        assertArrayEquals(result, q.maxSlidingWindow(test, 2));
    }
}