package array;

import java.util.Arrays;

/**
 * @author zyzhao
 * @description
 * @date 2021年08月18日 23:14
 */
public class Q557ReverseWordsinaStringIII {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = 0;
        int len = chars.length;
        while(j < len){
            if(chars[j] == ' '){
                reverseString(chars, i, j-1);
                j++;
                i = j;
            }else{
                j++;
            }
        }
        reverseString(chars, i, j-1);
        return new String(chars);
    }

    private void reverseString(char[] s, int i, int j) {
        while (i < j) {
            char t = s[i];
            s[i] = s[j];
            s[j] = t;
            i++;
            j--;
        }
    }
}
