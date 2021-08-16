package array;

/**
 * @author zyzhao
 * @description
 * @date 2021年08月16日 21:11
 */
public class A189RotateArray {

    public void rotate(int[] nums, int k) {
        rotate3(nums, k);
    }

    public void rotate3(int[] nums, int k){
        int len = nums.length;
        k = k % len;
        reverse(nums, 0, len - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, len - 1);
    }

    private void reverse(int[] nums, int from, int to) {
        while(from < to){
            int t = nums[to];
            nums[to--] = nums[from];
            nums[from++] = t;
        }
    }

    /**
     *
     * @author zyzhao
     * @description 解法2，利用count存储变更过的数量
     * 空间复杂度为0(1)
     * @date 2021/8/16 22:11
     * @param nums 数组
     * @param k 移动个数
     */
    public void rotate2(int[] nums, int k){
        int count = 0;
        int len = nums.length;
        int from = 0;
        while(count < len){
            int current = from;
            int temp = nums[current];
            do{
                int to = (from + k) % len;
                int t = nums[to];
                nums[to] = temp;
                temp = t;
                from = to;
                count++;
            }while (from != current);
            from++;
        }
    }

    /**
     *
     * @author zyzhao
     * @date 2021/8/16 21:43
     * @description 空间复杂度为n
     * @param nums 数组
     * @param k 移动值
     */
    public void rotate1(int[] nums, int k) {
        int len = nums.length;
        int count = 0;
        int temp = nums[0];
        int to = k % len;
        int from = 0;
        int[] ifChange = new int[len];
        while(count < len){
            if(ifChange[from] == 1){
                from = (from + 1) % len;
                to = (from + k) % len;
                temp = nums[from];
                continue;
            }else{
                count++;
                ifChange[from] = 1;
            }
            int t = nums[to];
            nums[to] = temp;
            temp = t;
            from = to;
            to = (from + k) % len;
        }
    }
}
