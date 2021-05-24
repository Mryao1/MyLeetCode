package array;

import java.util.*;

/**
 * @author 赵子跃
 * @date 2021年05月16日 13:58
 */
public class Merge_Intervals {
    public int[][] merge(int[][] intervals) {
        if(Objects.isNull(intervals) || intervals.length == 0) {
            return new int[0][0];
        }
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        List<int[]> rtn = new ArrayList<>();
        int len = intervals.length;
        for (int[] interval : intervals) {
            int l = interval[0], r = interval[1];
            int size = rtn.size();
            if (size == 0 || rtn.get(size - 1)[1] < l) {
                rtn.add(new int[]{l, r});
            } else {
                rtn.get(size - 1)[1] = Math.max(r, rtn.get(size - 1)[1]);
            }
        }
        return rtn.toArray(new int[rtn.size()][]);
        //        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        //        Arrays.sort(intervals, new Comparator<int[]>() {
        //            @Override
        //            public int compare(int[] o1, int[] o2) {
        //                return o1[0] - o2[0];
        //            } });

    }

    public static void main(String[] args) {
        Merge_Intervals solution = new Merge_Intervals();
        System.out.print("rtn" + Arrays.deepToString(solution.merge(new int[][]{new int[]{1, 3}, new int[]{2, 6}, new int[]{8, 10}, new int[]{15, 18}})));
    }

}
