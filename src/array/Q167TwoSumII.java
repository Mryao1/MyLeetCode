package array;

/**
 * @author zyzhao
 * @description
 * @date 2021年08月17日 20:33
 */
public class Q167TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        return twoSum3(numbers, target);
    }

    /**
     *
     * @author zyzhao
     * @date 2021/8/17 21:22
     * @description 二分法+双指针
     * @param numbers 目标数组
     * @param target 目标值
     * @return int[]
     */
    private int[] twoSum3(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        while(i<j){
            int m = i + (j - i) / 2;
            if((numbers[i] + numbers[m]) > target){
                j = m - 1;
            }else if (numbers[j] + numbers[m] < target){
                i = m + 1;
            }else if (numbers[i] + numbers[j] > target){
                j--;
            }else if (numbers[i] + numbers[j] < target){
                i++;
            }else {
                return new int[]{i+1, j+1};
            }
        }
        return new int[]{-1, -1};
    }

    /**
     *
     * @author zyzhao
     * @date 2021/8/17 21:23
     * @description 双指针
     * @param numbers 目标数组
     * @param target 目标值
     * @return int[]
     */
    private int[] twoSum2(int[] numbers, int target){
        if(null == numbers || 0 == numbers.length){
            return null;
        }
        int i = 0;
        int j = numbers.length - 1;
        while(i < j){
            if((numbers[i] + numbers[j]) == target){
                break;
            }
            while(numbers[j] > (target - numbers[i])){
                j--;
            }
            while(numbers[i] < (target - numbers[j])){
                i++;
            }
        }
        return new int[]{i+1,j+1};
    }

    /**
     *
     * @author zyzhao
     * @date 2021/8/17 21:23
     * @description 二分法
     * @param numbers 目标数组
     * @param target 目标值
     * @return int[]
     */
    private int[] twoSum1(int[] numbers, int target) {
        int len = numbers.length;
        int first = 0;
        int second = -1;
        while(first<len){
            second = search(numbers, target-numbers[first], first + 1);
            if(second != -1){
                break;
            }
            first++;
        }
        return new int[]{first+1, second+1};
    }

    private int search(int[] numbers, int target, int i) {
        int j = numbers.length - 1;
        while(i<=j){
            int mid = i + (j - i) / 2;
            if (target == numbers[mid]){
                return mid;
            }else if (target < numbers[mid]){
                j = mid - 1;
            }else{
                i = mid + 1;
            }
        }
        return -1;
    }
}
