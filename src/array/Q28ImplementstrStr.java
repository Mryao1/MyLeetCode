package array;

/**
 * @author zyzhao
 * @date 2022年03月20日 14:30
 */

public class Q28ImplementstrStr {


    private int[] getNext(String needle){
        int[] next = new int[needle.length()];
        int j = -1;
        next[0] = j;
        for (int i = 1; i < needle.length(); i++) {
            while(j >=0 && needle.charAt(i) != needle.charAt(j + 1)){
                j = next[j];
            }
            if (needle.charAt(i) == needle.charAt(j + 1)){
                j++;
            }
            next[i] = j;
        }
        return next;
    }

    public int strStr(String haystack, String needle) {
        if (haystack.length() == 0){
            return 0;
        }

        int[] next = getNext(needle);
        int j = -1;
        for (int i = 0; i < haystack.length(); i++) {
            while (j >= 0 && haystack.charAt(i) != needle.charAt(j + 1)){
                j = next[j];
            }
            if (haystack.charAt(i) == needle.charAt(j + 1)){
                j++;
            }
            if (j == needle.length() - 1){
                return i-needle.length()+1;
            }
        }
        return -1;
    }

}
