package array;

import java.util.*;

/**
 * @author 赵子跃
 * @date 2021年05月16日 14:39
 */
public class Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstringN1(String s) {
        if (Objects.isNull(s) || s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        int len = s.length();
        int l = 0, r = 0;
        int maxLen = 0;
        for(;r<len;r++){
            char c = s.charAt(r);
            if(map.containsKey(c)){
                l = Math.max(map.get(c)+1, l);
            }
            maxLen = Math.max(maxLen, r-l+1);
            map.put(c,r);
        }
        return maxLen;
    }
    public int lengthOfLongestSubstringN2(String s) {
        if(Objects.isNull(s) || s.length() == 0){
            return 0;
        }
        Set<Character> set = new HashSet<Character>();
        int len = s.length();
        int maxLen = 0;
        for (int i = 0; i < len; i++) {
            int l = 1;
            set.add(s.charAt(i));
            for (int j = i + 1; j < len; j++) {
                if(set.contains(s.charAt(j))){
                    break;
                }else{
                    set.add(s.charAt(j));
                    l++;
                }
            }
            maxLen = Math.max(maxLen, l);
            set.clear();
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Longest_Substring_Without_Repeating_Characters solu = new Longest_Substring_Without_Repeating_Characters();
        final String test = "abacddd";
        System.out.println("N2\t"+solu.lengthOfLongestSubstringN2(test));
        System.out.println("N1\t"+solu.lengthOfLongestSubstringN1(test));
    }
}
