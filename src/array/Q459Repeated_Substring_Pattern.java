package array;

/**
 * @author zyzhao
 * @date 2022年04月08日 21:07
 */

public class Q459Repeated_Substring_Pattern {

    private int[] getNext(String s){
        char[] chars = s.toCharArray();
        int[] next = new int[chars.length];
        int j = -1;
        next[0] = j;
        for (int i = 1; i < chars.length; i++) {
            while (j >= 0 && chars[i] != chars[j+1]){
                j = next[j];
            }
            if (chars[i] == chars[j+1]){
                j++;
            }
            next[i] = j;
        }
        return next;
    }

    public boolean repeatedSubstringPattern(String s) {
        if (s.length() == 0){
            return false;
        }
        int[] next = getNext(s);
        int len = s.length();
        return next[len - 1] != -1 && len % (len - (next[len - 1] + 1)) == 0;
    }

}
