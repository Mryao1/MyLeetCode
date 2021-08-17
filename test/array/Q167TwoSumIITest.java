package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q167TwoSumIITest {

    private static final Q167TwoSumII q = new Q167TwoSumII();

    @Test
    public void test1(){
        int[] req = new int[]{2,7,11,15};
        int[] exp = new int[]{1,2};
        assertArrayEquals(exp, q.twoSum(req, 9));
    }

    @Test
    public void test2(){
        int[] req = new int[]{2,3,4};
        int[] exp = new int[]{1,3};
        assertArrayEquals(exp, q.twoSum(req, 6));
    }

    @Test
    public void test3(){
        int[] req = new int[]{-1,0};
        int[] exp = new int[]{1,2};
        assertArrayEquals(exp, q.twoSum(req, -1));
    }

    @Test
    public void test4(){
        int[] req = new int[]{0,0,3,4};
        int[] exp = new int[]{1,2};
        assertArrayEquals(exp, q.twoSum(req, 0));
    }

    @Test
    public void test5(){
        int[] req = new int[]{5, 25, 75};
        int[] exp = new int[]{2,3};
        assertArrayEquals(exp, q.twoSum(req, 100));
    }

}