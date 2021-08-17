package array;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q704BinarySearchTest {

    static Q704BinarySearch q704BinarySearch;

    @BeforeClass
    public static void search() {
        q704BinarySearch = new Q704BinarySearch();
    }

    @Test
    public void test1(){
        assertEquals(1, q704BinarySearch.search(new int[]{1, 2, 4, 3}, 2));
    }

    @Test
    public void test2(){
        assertEquals(-1, q704BinarySearch.search(new int[]{1,5,4,3}, 2));
    }
    @Test
    public void test3(){
        assertEquals(0, q704BinarySearch.search(new int[]{1,2,3,4}, 1));
    }
    @Test
    public void test4(){
        assertEquals(3, q704BinarySearch.search(new int[]{1,2,3,4}, 4));
    }
}