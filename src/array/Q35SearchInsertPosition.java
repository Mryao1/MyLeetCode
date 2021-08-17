package array;

/**
 * @author zyzhao
 * @description
 * @date 2021年08月15日 20:14
 */
public class Q35SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if(null == nums || nums.length == 0){
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        int center = left + (right - left) / 2;
//        while(left < right){
//            if(target == nums[center]){
//                return center;
//            }else if(target < nums[center]){
//                right = center - 1;
//            }else{
//                left = center + 1;
//            }
//            center = left + (right - left) / 2;
//        }
//        if(nums[center] < target) {
//            return center + 1;
//        }
//        return center;
        while(left <= right){
            if(target <= nums[center]){
                right = center - 1;
            }else{
                left = center + 1;
            }
            center = left + (right - left) / 2;
        }
        return left;
    }
}
