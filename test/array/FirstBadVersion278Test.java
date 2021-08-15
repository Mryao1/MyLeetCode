package array;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class FirstBadVersion278Test {

    private static FirstBadVersion278 firstBadVersion278;
    private int bad;
    private int n;

    @Before
    public void setUp() {
        n = (int) (Math.random() * 100);
        bad = new Random().nextInt(n);
        firstBadVersion278 = new FirstBadVersion278(bad);
    }

    @Test
    public void test(){
        assertEquals(bad, firstBadVersion278.firstBadVersion(n));
    }
}