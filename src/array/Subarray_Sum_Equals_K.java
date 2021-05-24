package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author 赵子跃
 * @date 2021年05月14日 23:14
 */
public class Subarray_Sum_Equals_K {
    public int subarraySumN2(int[] nums, int k) {
        if(Objects.isNull(nums) || nums.length == 0) return 0;
        int len = nums.length;
        int count = 0;
        int[] sum = new int[len];

        //获得前缀和数组
        sum[0] = nums[0];
        for(int i = 1; i<len;i++){
            sum[i] = sum[i-1]+nums[i];
        }

        //遍历子数组
        for (int r = 0; r < len; r++) {
            for (int l = -1; l < r; l++) {
                int sub;
                if(l<0){
                    sub = sum[r];
                }else{
                    sub = sum[r]-sum[l];
                }
                if(sub == k){
                    count++;
                }
            }
        }
        return count;
    }


    public int subarraySumN(int[] nums, int k) {
        if(Objects.isNull(nums) || nums.length == 0){
            return 0;
        }
        int len = nums.length;
        int[] sum = new int[len];
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        //置入前缀和为0的数量
        map.put(0,1);

        //计算sum数组
        sum[0] = nums[0];
        for (int i = 1; i < len; i++) {
            sum[i] = sum[i - 1]+nums[i];
        }

        //统计前缀和
        for (int i = 0; i < len; i++) {
            if(map.containsKey(sum[i]-k)){
                count+=map.get(sum[i]-k);
            }
            map.put(sum[i], map.getOrDefault(sum[i], 0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        Subarray_Sum_Equals_K subarray_sum_equals_k = new Subarray_Sum_Equals_K();
        System.out.println("return " + subarray_sum_equals_k.subarraySumN2(new int[]{1, 1, 1},2));
        System.out.println("return " + subarray_sum_equals_k.subarraySumN(new int[]{1, 1, 1},2));
    }
}
