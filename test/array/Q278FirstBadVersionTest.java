package array;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class Q278FirstBadVersionTest {

    private static Q278FirstBadVersion q;
    private int bad;
    private int n;

    @Before
    public void setUp() {
        n = (int) (Math.random() * 100);
        bad = new Random().nextInt(n);
        q = new Q278FirstBadVersion(bad);
    }

    @Test
    public void test(){
        assertEquals(bad, q.firstBadVersion(n));
    }
}