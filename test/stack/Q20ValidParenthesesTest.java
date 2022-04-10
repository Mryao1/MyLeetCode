package stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q20ValidParenthesesTest {

    private final Q20ValidParentheses q = new Q20ValidParentheses();

    @Test
    public void test1(){
        assertTrue(q.isValid("()"));
    }

    @Test
    public void test2(){
        assertTrue(q.isValid("()[]{}"));
    }

    @Test
    public void test3(){
        assertFalse(q.isValid("(]"));
    }

    @Test
    public void test4(){
        assertFalse(q.isValid("([)]"));
    }

    @Test
    public void test5(){
        assertTrue(q.isValid("{[]}"));
    }

    @Test
    public void test6(){
        assertFalse(q.isValid("}{"));
    }

    @Test
    public void test7(){
        assertFalse(q.isValid("{[]}}{"));
    }

}