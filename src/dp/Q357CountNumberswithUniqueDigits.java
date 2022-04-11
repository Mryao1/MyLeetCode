package dp;

/**
 * @author zyzhao
 * @date 2022年04月11日 21:24
 */

public class Q357CountNumberswithUniqueDigits {

    public int countNumbersWithUniqueDigits(int n) {
        if (0 == n){
            return 0;
        }
        if (1 == n){
            return 10;
        }

        int ans = 10;
        int t = 9;
        for (int i = 2; i <= n; i++) {
            t *= 11-i;
            ans += t;
        }
        return ans;
    }

}
