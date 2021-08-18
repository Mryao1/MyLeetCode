package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q557ReverseWordsinaStringIIITest {

    private static final Q557ReverseWordsinaStringIII q = new Q557ReverseWordsinaStringIII();

    @Test
    public void test1(){
        String req = "Let's take LeetCode contest";
        String exp = "s'teL ekat edoCteeL tsetnoc";
        assertEquals(exp, q.reverseWords(req));
    }

}