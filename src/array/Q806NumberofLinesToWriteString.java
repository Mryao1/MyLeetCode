package array;

/**
 * @author zyzhao
 * @date 2022年04月12日 21:52
 */

public class Q806NumberofLinesToWriteString {

    public int[] numberOfLines(int[] widths, String s) {
        int nLines = 1;
        int sumWidth = 0;
        for (int i = 0; i < s.length(); i++) {
            sumWidth += widths[s.charAt(i) - 'a'];
            if (sumWidth > 100){
                nLines ++;
                sumWidth = widths[s.charAt(i) - 'a'];
            }
        }

        return new int[]{nLines, sumWidth};
    }

}
