package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q344ReverseStringTest {
    public static final Q344ReverseString q = new Q344ReverseString();

    @Test
    public void test1(){
        char[] req = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] exp = new char[]{'o', 'l', 'l', 'e', 'h'};
        q.reverseString(req);
        assertArrayEquals(exp, req);
    }

    @Test
    public void test2(){
        char[] req = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        char[] exp = new char[]{'h', 'a', 'n', 'n', 'a', 'H'};
        q.reverseString(req);
        assertArrayEquals(exp, req);
    }

}