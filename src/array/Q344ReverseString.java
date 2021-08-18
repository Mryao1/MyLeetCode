package array;

/**
 * @author zyzhao
 * @description
 * @date 2021年08月18日 23:05
 */
public class Q344ReverseString {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;
        while(i<j){
            char t = s[i];
            s[i] = s[j];
            s[j] = t;
            i++;
            j--;
        }
    }
}
