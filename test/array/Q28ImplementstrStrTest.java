package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q28ImplementstrStrTest {

    private static final Q28ImplementstrStr q = new Q28ImplementstrStr();

    @Test
    public void test1(){
        int result = q.strStr("hello", "ll");
        assertEquals(2, result);
    }

    @Test
    public void test2(){
        int result = q.strStr("aaaaa", "bba");
        assertEquals(-1, result);
    }

    @Test
    public void test3(){
        int result = q.strStr("", "");
        assertEquals(0, result);
    }

    @Test
    public void test4(){
        int result = q.strStr("mississippi", "issip");
        assertEquals(4, result);
    }

    @Test
    public void test5(){
        int result = q.strStr("a", "a");
        assertEquals(0, result);
    }

}