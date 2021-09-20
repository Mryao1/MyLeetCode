package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q73SetMatrixZeroesTest {
    private Q73SetMatrixZeroes q = new Q73SetMatrixZeroes();

    @Test
    public void test1(){
        int[][] req = new int[][]{
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        int[][] expected = new int[][]{
                {1,0,1},
                {0,0,0},
                {1,0,1}
        };
        q.setZeroes(req);
        assertArrayEquals(req, expected);
    }

    @Test
    public void test2(){
        int[][] req = new int[][]{
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        int[][] expected = new int[][]{
                {0,0,0,0},
                {0,4,5,0},
                {0,3,1,0}
        };
        q.setZeroes(req);
        assertArrayEquals(req, expected);
    }
    @Test
    public void test3(){
        int[][] req = new int[][]{
                {1,2,3,4},
                {5,0,7,8},
                {0,10,11,12},
                {13,14,15,0}
        };
        int[][] expected = new int[][]{
                {0,0,3,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0}
        };
        q.setZeroes(req);
        assertArrayEquals(expected, req);
    }

}