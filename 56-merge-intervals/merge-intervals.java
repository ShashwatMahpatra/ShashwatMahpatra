import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (x, y) -> x[0] - y[0]);

        int [][] a = new int[intervals.length][2];
        int k = 0;

        a[k][0] = intervals[0][0];
        a[k][1] = intervals[0][1];

        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] <= a[k][1]){
                a[k][1] = Math.max(a[k][1], intervals[i][1]);
            } else {
                k++;
                a[k][0] = intervals[i][0];
                a[k][1] = intervals[i][1];
            }
        }

        return Arrays.copyOf(a, k + 1);
    }
}