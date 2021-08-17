package array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author zyzhao
 * @description 给定一个n个元素有序的（升序）整型数组nums 和一个目标值target ，写一个函数搜索nums中的 target，
 * 如果目标值存在返回下标，否则返回 -1。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-search
 * @date 2021年08月14日 22:37
 */
public class Q704BinarySearch {
    public int search(int[] nums, int target) {
        if(null == nums || nums.length == 0) {
            return -1;
        }
        return binarySearchIteration(nums, 0, nums.length - 1, target);
    }

    private int binarySearchRecursion(int[] nums, int left, int right, int target) {
        if(left>right){
            return -1;
        }
        int center = (left + right) / 2;
        if(nums[center] == target){
            return center;
        }else if(target < nums[center]){
            return binarySearchRecursion(nums, left, center - 1, target);
        }else {
            return binarySearchRecursion(nums, center + 1, right, target);
        }
    }

    private int binarySearchIteration(int[] nums, int left, int right, int target){
        while(left <= right){
            int center = left + (right - left) / 2;
            if(nums[center] == target){
                return center;
            }else if(target < nums[center]){
                right = center - 1;
            }else{
                left = center + 1;
            }
        }
        return -1;
    }

}
