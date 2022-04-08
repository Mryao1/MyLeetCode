package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q459Repeated_Substring_PatternTest {

    private static Q459Repeated_Substring_Pattern q = new Q459Repeated_Substring_Pattern();

    @Test
    public void test1(){
        assertTrue(q.repeatedSubstringPattern("abcabc"));
    }

    @Test
    public void test2(){
        assertFalse(q.repeatedSubstringPattern("abac"));
    }

}