package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q977SquaresOfASortedArrayTest {
    private static final Q977SquaresOfASortedArray obj = new Q977SquaresOfASortedArray();

    @Test
    public void test1(){
        int[] req = new int[]{-4,-1,0,3,10};
        int[] exp = new int[]{0, 1, 9, 16, 100};
        int[] rtn = obj.sortedSquares(req);
        assertArrayEquals(exp, rtn);
    }

    @Test
    public void test2(){
        int[] req = new int[]{-7,-3,2,3,11};
        int[] exp = new int[]{4,9,9,49,121};
        int[] rtn = obj.sortedSquares(req);
        assertArrayEquals(exp, rtn);
    }
}