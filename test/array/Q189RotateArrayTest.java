package array;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q189RotateArrayTest {
    private static Q189RotateArray a;

    @BeforeClass
    public static void setUp() {
        a = new Q189RotateArray();
    }

    @Test
    public void test1(){
        int[] req = new int[]{1,2,3,4,5,6,7};
        int[] exp = new int[]{5,6,7,1,2,3,4};
        a.rotate(req, 3);
        assertArrayEquals(exp, req);
    }

    @Test
    public void test2(){
        int[] req = new int[]{-1,-100,3,99};
        int[] exp = new int[]{3,99,-1,-100};
        a.rotate(req, 2);
        assertArrayEquals(exp, req);
    }
}