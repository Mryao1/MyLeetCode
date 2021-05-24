package array;

import java.util.Arrays;

public class Remove_Duplicates_from_Sorted_Array {
    /**
     * 移除重复的数字
     * @param nums 数组
     * @return 数组长度
     */
    public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int len = nums.length;
        int fast = 0;
        int low = 0;
        while(fast<len){
            if(nums[fast]!=nums[low]){
                if(fast-low>1) {
                    nums[low+1] = nums[fast];
                }
                low++;
            }
            fast++;
        }
        return ++low;
    }
    //todo 剪枝

    public static void main(String[] args) {
        Remove_Duplicates_from_Sorted_Array solution = new Remove_Duplicates_from_Sorted_Array();
        int[] test = {1,1,2};
//        int[] test = {1,2};
        int len = solution.removeDuplicates(test);
        System.out.println("len = " + len);
        System.out.println("test"+ Arrays.toString(test));
    }
}
