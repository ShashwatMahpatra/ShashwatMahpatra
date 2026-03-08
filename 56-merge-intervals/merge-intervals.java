class Solution {
    public int[][] merge(int[][] intervals) {
        // Sort by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] last = result.get(result.size() - 1);

            if (intervals[i][0] <= last[1]) {
                // Overlapping: merge by extending the end if needed
                last[1] = Math.max(last[1], intervals[i][1]);
            } else {
                // Not overlapping: just add as-is
                result.add(intervals[i]);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}