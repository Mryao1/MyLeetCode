package array;

/**
 * @author zyzhao
 * @description
 * @date 2021年08月15日 21:05
 */
public class A977SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        if(null == nums || nums.length == 0){
            return new int[0];
        }
        int len = nums.length;
        int[] rtn = new int[len];
        int left = 0;
        int right = len - 1;
        int p = right;
        while(left <= right){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if(leftSquare < rightSquare){
                rtn[p--] = rightSquare;
                right--;
            }else{
                rtn[p--] = leftSquare;
                left++;
            }
        }
        return rtn;
    }
}
