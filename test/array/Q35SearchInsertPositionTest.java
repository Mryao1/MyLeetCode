package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q35SearchInsertPositionTest {
    private static final Q35SearchInsertPosition q = new Q35SearchInsertPosition();

    @Test
    public void test1(){
        assertEquals(2, q.searchInsert(new int[]{1,3,5,6}, 5));
    }

    @Test
    public void test2(){
        assertEquals(1, q.searchInsert(new int[]{1,3,5,6}, 2));
    }

    @Test
    public void test3(){
        assertEquals(4, q.searchInsert(new int[]{1,3,5,6}, 7));
    }

    @Test
    public void test4(){
        assertEquals(0, q.searchInsert(new int[]{1,3,5,6}, 0));
    }

    @Test
    public void test5(){
        assertEquals(0, q.searchInsert(new int[]{1}, 0));
    }

}