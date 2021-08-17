package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q283MoveZeroesTest {
    private static final Q283MoveZeroes q = new Q283MoveZeroes();

    @Test
    public void test1(){
        int[] req = new int[]{0,1,0,3,12};
        int[] expected = new int[]{1,3,12,0,0};
        q.moveZeroes(req);
        assertArrayEquals(expected, req);
    }

    @Test
    public void test2(){
        int[] req = new int[]{1,10,0,3,12};
        int[] expected = new int[]{1,10,3,12,0};
        q.moveZeroes(req);
        assertArrayEquals(expected, req);
    }

}