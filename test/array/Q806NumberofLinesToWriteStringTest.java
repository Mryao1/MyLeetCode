package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q806NumberofLinesToWriteStringTest {

    private static final Q806NumberofLinesToWriteString q = new Q806NumberofLinesToWriteString();

    @Test
    public void test1() {
        int[] widths = new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        int[] results = new int[]{3, 60};
        assertArrayEquals(results, q.numberOfLines(widths, "abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void test2() {
        int[] widths = new int[]{4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        int[] results = new int[]{2, 4};
        assertArrayEquals(results, q.numberOfLines(widths, "bbbcccdddaaa"));
    }

    @Test
    public void test3() {
        int[] widths = new int[]{3,4,10,4,8,7,3,3,4,9,8,2,9,6,2,8,4,9,9,10,2,4,9,10,8,2};
        int[] results = new int[]{1, 100};
        assertArrayEquals(results, q.numberOfLines(widths, "mqblbtpvicqhbrejb"));
    }
}