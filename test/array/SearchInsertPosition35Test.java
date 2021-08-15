package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInsertPosition35Test {
    private static final SearchInsertPosition35 searchInsertPosition35 = new SearchInsertPosition35();

    @Test
    public void test1(){
        assertEquals(2, searchInsertPosition35.searchInsert(new int[]{1,3,5,6}, 5));
    }

    @Test
    public void test2(){
        assertEquals(1, searchInsertPosition35.searchInsert(new int[]{1,3,5,6}, 2));
    }

    @Test
    public void test3(){
        assertEquals(4, searchInsertPosition35.searchInsert(new int[]{1,3,5,6}, 7));
    }

    @Test
    public void test4(){
        assertEquals(0, searchInsertPosition35.searchInsert(new int[]{1,3,5,6}, 0));
    }

    @Test
    public void test5(){
        assertEquals(0, searchInsertPosition35.searchInsert(new int[]{1}, 0));
    }

}