package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author 赵子跃
 * @date 2021年05月14日 22:49
 */
public class Count_Number_of_Nice_Subarrays {
    public int numberOfSubarraysN2(int[] nums, int k) {
        if(Objects.isNull(nums)||nums.length==0){
            return 0;
        }
        int len = nums.length;
        int sum[] = new int[len];
        int count = 0;
        //生成sum数组
        generateSum(nums, len, sum);
        //遍历sum数组判断
        for (int r = 0; r < len; r++) {
            for (int l = -1; l < r; l++) {
                int sub = 0;
                if(l<0){
                    sub = sum[r];
                }else{
                    sub = sum[r]-sum[l];
                }
                if(sub==k){
                    count++;
                }
            }
        }
        return count;
    }
    public int numberOfSubarraysN1(int[] nums, int k) {
        if (Objects.isNull(nums) || nums.length == 0) {
            return 0;
        }
        int len = nums.length;
        int sum[] = new int[len];
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        //生成sum数组
        generateSum(nums, len, sum);
        map.put(0,1);
        //遍历sum数组判断
        for (int i = 0; i < len; i++) {
            if(map.containsKey(sum[i] - k)){
                count+= map.get(sum[i]-k);
            }
            map.put(sum[i], map.getOrDefault(sum[i],0)+1);
        }
        return count;
    }

    /**
     * 生成Sum数组，前一个sum+当前num
     * @param nums  nums数组
     * @param len   数组长度
     * @param sum   结果数组
     */
    private void generateSum(int[] nums, int len, int[] sum) {
        if (isOdd(nums[0])) {
            sum[0] = 1;
        } else {
            sum[0] = 0;
        }
        for (int i = 1; i < len; i++) {
            if (isOdd(nums[i])) {
                sum[i] = sum[i - 1] + 1;
            } else {
                sum[i] = sum[i - 1];
            }
        }
    }

    public static void main(String[] args) {
        Count_Number_of_Nice_Subarrays solu = new Count_Number_of_Nice_Subarrays();
        System.out.println("return "+ solu.numberOfSubarraysN2(new int[]{2, 2, 2, 1, 2, 2, 1, 2, 2, 2}, 2));
        System.out.println("return "+ solu.numberOfSubarraysN1(new int[]{2, 2, 2, 1, 2, 2, 1, 2, 2, 2}, 2));
    }

    private static Boolean isOdd(int n){
        return n % 2 == 1;
    }
}
