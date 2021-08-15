package array;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearch704Test {

    static BinarySearch704 binarySearch704;

    @BeforeClass
    public static void search() {
        binarySearch704 = new BinarySearch704();
    }

    @Test
    public void test1(){
        assertEquals(1, binarySearch704.search(new int[]{1, 2, 4, 3}, 2));
    }

    @Test
    public void test2(){
        assertEquals(-1, binarySearch704.search(new int[]{1,5,4,3}, 2));
    }
    @Test
    public void test3(){
        assertEquals(0, binarySearch704.search(new int[]{1,2,3,4}, 1));
    }
    @Test
    public void test4(){
        assertEquals(3, binarySearch704.search(new int[]{1,2,3,4}, 4));
    }
}