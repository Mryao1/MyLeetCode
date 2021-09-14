package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q724FindPivotIndexTest {

    private static final Q724FindPivotIndex q = new Q724FindPivotIndex();

    @Test
    public void test1(){
        assertEquals(3, q.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }

    @Test
    public void test2(){
        assertEquals(-1, q.pivotIndex(new int[]{1, 2, 3}));
    }

    @Test
    public void test3(){
        assertEquals(0, q.pivotIndex(new int[]{2, 1, -1}));
    }

}