package array;

/**
 * @author zyzhao
 * @description
 * @date 2021年08月16日 22:37
 */
public class Q283MoveZeroes {
    public void moveZeroes(int[] nums) {
        int current = 0;
        int notZero = 0;
        while(notZero < nums.length){
            if(0 == nums[notZero]){
                notZero++;
                continue;
            }
            nums[current++] = nums[notZero++];
        }
        while(current < nums.length){
            nums[current++] = 0;
        }
    }
}
