package stack;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Q150EvaluateReversePolishNotationTest {

    private static final Q150EvaluateReversePolishNotation q = new Q150EvaluateReversePolishNotation();

    @Test
    public void test1(){
        String[] testList = new String[]{"2","1","+","3","*"};
        assertEquals(9, q.evalRPN(testList));
    }

    @Test
    public void test2(){
        String[] testList = new String[]{"4","13","5","/","+"};
        assertEquals(6, q.evalRPN(testList));
    }

    @Test
    public void test3(){
        String[] testList = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        assertEquals(22, q.evalRPN(testList));
    }

    @Test
    public void test4(){
        String[] testList = new String[]{"2","1","+","3","*"};
        assertEquals(q.evalRPN(testList), 9);
    }

}