package array;

/**
 * @author zyzhao
 * @description
 * @date 2021年08月15日 17:32
 */
public class Q278FirstBadVersion {

    private static int badVersion;

    public Q278FirstBadVersion(int v){
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
