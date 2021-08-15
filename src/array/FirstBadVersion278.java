package array;

/**
 * @author zyzhao
 * @description
 * @date 2021年08月15日 17:32
 */
public class FirstBadVersion278 {

    private static int badVersion;

    public FirstBadVersion278(int v){
        badVersion = v;
    }

    public boolean isBadVersion(int version){
        return version >= badVersion;
    }
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int center = left + (right - left) / 2;
        while (left != right) {
            if(isBadVersion(center)){
                right = center;
            }else{
                left = center + 1;
            }
            center = left + (right - left) / 2;
        }
        return left;
    }
}
