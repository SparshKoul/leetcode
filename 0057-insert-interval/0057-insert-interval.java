class Solution {
    public int[][] insert(int[][] arr, int[] newInterval) {
        int n = arr.length;

        int intervals[][] = new int[n + 1][2];
        for (int i = 0; i < n; i++) {
            intervals[i] = arr[i];
        }
        intervals[n][0] = newInterval[0];
        intervals[n][1] = newInterval[1];

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> res = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < n+1; i++) {
            if (intervals[i][0] <= end) {//merge (new intvel first with old intv last )
                end = Math.max(end, intervals[i][1]);
            } else {
                res.add(new int[] { start, end });
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        res.add(new int[] { start, end });
        return res.toArray(new int[res.size()][]);

    }
}