package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q48RotateImageTest {

    private static final Q48RotateImage q = new Q48RotateImage();

    @Test
    public void test1(){
        int[][] req = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] expected = new int[][]{
                {7,4,1},
                {8,5,2},
                {9,6,3}
        };
        q.rotate2(req);
        assertArrayEquals(expected, req);
    }

    @Test
    public void test2(){
        int[][] req = new int[][]{
                {5,1,9,11},
                {2,4,8,10},
                {13,3,6,7},
                {15,14,12,16}
        };
        int[][] expected = new int[][]{
                {15,13,2,5},
                {14,3,4,1},
                {12,6,8,9},
                {16,7,10,11}
        };
        q.rotate2(req);
        assertArrayEquals(expected, req);
    }

}